package recipe.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import allmember.model.AllMember;
import recipe.model.Recipe;
import recipe.model.RecipeDao;

@Controller
public class RecipeInsertController {
	
	private static final String getPage = "RecipeInsertForm";
	private static final String gotoPage = "redirect:/list.rec";
	private static final String command = "/insert.rec";
	
	@Autowired
	private RecipeDao recipeDao;
	
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping(value = command, method = RequestMethod.GET)
	public String doActionGet(HttpSession session) {
		
		System.out.println(this.getClass() + "Get방식 들어옴");
		System.out.println("loginInfo : " + session.getAttribute("loginInfo"));
		//loginfo session 설정 : AllMemberLoginController(로그인 버튼 클릭)
		
		//로그인이 되어있지 않으면 로그인 하도록 페이지 이동
		if(session.getAttribute("loginInfo") == null) {
			
			session.setAttribute("destination", "redirect:/insert.rec");// destination = "redirect:/insert.rec"
			return "redirect:/login.mem";
			
		} else {//세션 연결 되어있다면 RecipeInsertForm.jsp로 이동
			
			return getPage;
			
		}//else 
		
	}//
	
	//데이터 db에 입력하고 페이지 이동
	@RequestMapping(value = command, method = RequestMethod.POST)
	public ModelAndView doActionPost(@ModelAttribute("recipe") @Valid Recipe recipe, 
			BindingResult bindingResult, HttpSession session) {
		
		System.out.println(this.getClass() + "POST방식 들어옴" );
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println("servletContext.getRealPath('/')" + servletContext.getRealPath("/"));
		//C:\project\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\Project_AllRecipe\
		
		String uploadPath = servletContext.getRealPath("/resources/recipe/");
		System.out.println("uploadPath : " + uploadPath);
		// C:\project\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\Project_AllRecipe\resources\recipe\
		
		//세션에서 id값 가져와서 작성자에 입력 : 참조값으로 설정되어으므로 id값 사용
		System.out.println("sessionloginInfo : " + session.getAttribute("loginInfo"));
		System.out.println("session id : " + session.getAttribute("id"));
		AllMember writer = new AllMember();
		writer = (AllMember)session.getAttribute("loginInfo");
		System.out.println("writer.getId() : "+writer.getId());
		
		recipe.setWriter(writer.getId());
				
		//유효성 검사 항목 출력 및 데이터가 제대로 있는지 확인
		
		System.out.println("recipe.getRecnum() : " + recipe.getRecnum());
		System.out.println("recipe.getWriter() :" + recipe.getWriter() );
		System.out.println("recipe.getPsubject() : " + recipe.getPsubject());
		System.out.println("recipe.getTheme() : " + recipe.getTheme());
		System.out.println("recipe.getShortintro() : " + recipe.getShortintro());
		System.out.println("recipe.getIngredient() : " + recipe.getIngredient());
		System.out.println("recipe.getMovieurl() : " + recipe.getMovieurl());
		System.out.println("recipe.getIntro() : " + recipe.getIntro());
		System.out.println("recipe.getMainimage() : " + recipe.getMainimage());
		System.out.println("recipe.getImage1() : " + recipe.getImage1());
		System.out.println("recipe.getImage2() : " + recipe.getImage2());
		System.out.println("recipe.getImage3() : " + recipe.getImage3());
		System.out.println("recipe.getImage4() : " + recipe.getImage4());
		
		if(bindingResult.hasErrors()) {
			
			System.out.println("InsertController 유효성 검사 오류");
			
			mav.setViewName(getPage);// 오류 있으면 RecipeInsertForm.jsp로 이동, 재작성
			return mav;
		}
		
		ArrayList<MultipartFile> multi = new ArrayList<MultipartFile>();
		multi.add(recipe.getUploadmainimage());
		multi.add(recipe.getUploadimage1());
		multi.add(recipe.getUploadimage2());
		multi.add(recipe.getUploadimage3());
		multi.add(recipe.getUploadimage4());
		
		System.out.println("multi.size() : " + multi.size()); 
		//multi에 몇 장의 이미지가 담겨 있는 지 확인
		
		Integer cnt = -1;
		cnt = recipeDao.InsertData(recipe);
		
		if(cnt != -1) { //업로드 성공
			
			mav.setViewName(gotoPage); //redirect:/list.rec
			
			// multi에 담겨있는 사진 한개씩 꺼내서 처리
			for (int i = 0 ; i < multi.size() ; i++) {
				
				File destination = new File(uploadPath + File.separator + multi.get(i).getOriginalFilename());
				// C:\project\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\Project_Allrecipe\resources\recipe\사진이름.jpg
				
				try {
					multi.get(i).transferTo(destination);
				} catch(IllegalStateException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}//End of for
			System.out.println("업로드 성공");
		} else {//업로드 실패
			System.out.println("업로드 실패");	
			mav.setViewName(getPage);//RecipeInsertForm.jsp
			
		}//if ~ else 
		
		return mav;
		
	}//public ModelAndView doActionPost()

}
