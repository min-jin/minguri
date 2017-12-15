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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
		System.out.println("loginfo : " + session.getAttribute("loginfo"));
		//loginfo session 설정 : AllMemberLoginController(로그인 버튼 클릭)
		
		//로그인이 되어있지 않으면 로그인 하도록 페이지 이동
		if(session.getAttribute("loginfo") == null) {
			
			session.setAttribute("destination", "redirect:/insert.rec");// destination = "redirect:/insert.rec"
			return "redirect:/login.mem";
			
		} else {//세션 연결 되어있다면 RecipeInsertForm.jsp로 이동
			
			return getPage;
			
		}//else 
		
	}//
	
	//데이터 db에 입력하고 페이지 이동
	@RequestMapping(value = command, method = RequestMethod.POST)
	public ModelAndView doActionPost(@ModelAttribute("recipe") @Valid Recipe recipe, BindingResult bindingResult) {
		
		System.out.println(this.getClass() + "POST방식 들어옴" );
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println("servletContext.getRealPath('/')" + servletContext.getRealPath("/"));
		//C:\Spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\TeamProject\
		
		String uploadPath = servletContext.getRealPath("/resources");
		System.out.println("uploadPath : " + uploadPath);
		// C:\Spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\TeamProject\resources
		
		System.out.println("recipe.getPsubject() : " + recipe.getPsubject());
		
		if(bindingResult.hasErrors()) {
			
			System.out.println("유효성 검사 오류");
			mav.setViewName(getPage);// 오류 있으면 RecipeInsertForm.jsp로 이동, 재작성
			return mav;
		}
		//DEV : 이미지 파일 업로드 해야 함
		// 사진을 MultipartFile형식의 multi 한곳에 담았다
		ArrayList<MultipartFile> multi = new ArrayList<MultipartFile>();
		multi.add(recipe.getMainimage());
		multi.add(recipe.getImage1());
		multi.add(recipe.getImage2());
		multi.add(recipe.getImage3());
		multi.add(recipe.getImage4());
		
		System.out.println("multi.size() : " + multi.size()); 
		//multi에 몇 장의 이미지가 담겨 있는 지 확인
		
		Integer cnt = -1;
		cnt = recipeDao.InsertData(recipe);
		
		if(cnt != -1) { //업로드 성공
			
			mav.setViewName(gotoPage); //redirect:/list.rec
			
			// multi에 담겨있는 사진 한개씩 꺼내서 처리
			for (int i = 0 ; i < multi.size() ; i++) {
				
				File destination = new File(uploadPath + File.separator + multi.get(i).getOriginalFilename());
				// C:\Spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\TeamProject\resources\사진이름.jpg
				
				try {
					multi.get(i).transferTo(destination);
				} catch(IllegalStateException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}//End of for
			
		} else {//업로드 실패
				
			mav.setViewName(getPage);//RecipeInsertForm.jsp
			
		}//if ~ else 
		
		return mav;
		
	}//public ModelAndView doActionPost()

}