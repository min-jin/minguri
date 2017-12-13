package cookinfo.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyCookInfoDao")
public class CookInfoDao {
	private static String namespace="cookinfo.model.CookInfo";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	
}
