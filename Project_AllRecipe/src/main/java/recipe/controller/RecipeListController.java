package recipe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import recipe.model.Recipe;
import recipe.model.RecipeDao;
import utility.Paging;

@Controller
public class RecipeListController {
	
	private static final String getPage = "RecipeList";
	private static final String command = "/list.rec";
	
	@Autowired
	private RecipeDao recipeDao;
	
	//홈페이지에서 레시피 버튼 클릭시 이동kewyword )
	@RequestMapping(value = command)
	public ModelAndView doActionPost(
			@RequestParam(value="keyword", required = false)String keyword,
			@RequestParam(value="whatColumn", required = false)String whatColumn,
			@RequestParam(value="pageNumber", required = false)String pageNumber,
			@RequestParam(value="pageSize", required = false)String pageSize,
			HttpServletRequest request) {

		System.out.println("pageNumber : " + pageNumber + ", ");
		System.out.println("pageSize : " + pageSize + ",");
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("whatColumn", whatColumn);
		//변수(recnum) 담아서 총 몇 개인지 파악해보자
		int totalCount = recipeDao.GetTotalCount(map);
		
		System.out.println("전체 행수 (totalCount) : " + totalCount + ", ");
		String url = request.getContextPath() + "/" + this.command;
		
		ModelAndView mav = new ModelAndView();
		
		Paging pageInfo = new Paging(pageNumber, pageSize, totalCount, url, whatColumn,keyword,null);
		//keyword를 null값으로 설정
		
		System.out.println("offset : " + pageInfo.getOffset() + ", ");
		System.out.println("limit : " + pageInfo.getLimit() + ", ");
		
		List<Recipe> recipeLists = recipeDao.GetDataList(pageInfo, map);
		
		System.out.println("recipeLists.size() : " + recipeLists.size());
		
		mav.addObject("recipeLists", recipeLists);
		mav.addObject("pageInfo", pageInfo);
		mav.setViewName(getPage);
		
		return mav;//페이지 정보와 레시피 정보 담아서 RecipeList.jsp로 이동
		
	}//

}
