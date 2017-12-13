package opinion.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyOpinionDao")
public class OpinionDao {
	private static String namespace="opinion.model.Opinion";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
}
