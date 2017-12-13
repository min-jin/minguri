package recipe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyRecipeDao")
public class RecipeDao {
	private static String namespace="recipe.model.Recipe";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<Recipe> searchRecipe(Map<String, String> map) {
		List<Recipe> list=new ArrayList<Recipe>();
		list=sqlSessionTemplate.selectList(namespace+".searchRecipe", map);
		return list;
	}

	public List<Recipe> recentRecipe(int count) {
		List<Recipe> list=new ArrayList<Recipe>();
		RowBounds rowBounds=new RowBounds(count, 3);
		list=sqlSessionTemplate.selectList(namespace+".recentRecipe", null, rowBounds);
		return list;
	}
}
