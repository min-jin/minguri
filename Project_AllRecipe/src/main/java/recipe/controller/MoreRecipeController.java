package recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import recipe.model.Recipe;
import recipe.model.RecipeDao;

@Controller
public class MoreRecipeController {
	private static final String command="/moreRecipe.rec";
	
	@Autowired
	private RecipeDao recDao;
	
	@RequestMapping(value=command,method=RequestMethod.POST)
	@ResponseBody
	public String moreRecipe(@RequestParam("count") int count) {
		System.out.println(count);
		List<Recipe> list=recDao.recentRecipe(count);
		
		String str="";
		
		ObjectMapper mapper=new ObjectMapper();
		try {
			str=mapper.writeValueAsString(list);
			System.out.println(str);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return str;
	} 
}
