package recipe.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyRecipeDao")
public class RecipeDao {
	private static String namespace="recipe.model.Recipe";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
}
