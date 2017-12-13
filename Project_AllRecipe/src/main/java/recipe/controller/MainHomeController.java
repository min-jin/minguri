package recipe.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import recipe.model.RecipeDao;

@Controller
public class MainHomeController {
	private static final String command="/mainPage.rec";
	private static final String	getPage="MainHome";
	
	@Autowired
	private RecipeDao recDao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView goMainHome(
			@RequestParam(value="keyword",required=false) String keyword,
			HttpSession session) {
		
		ModelAndView mav=new ModelAndView();
		Map<String, String> map=new HashMap<String, String>();
		map.put("keyword", keyword);
		
		
		
		
		mav.setViewName(getPage);
		
		return mav;
	}
}
