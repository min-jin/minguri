package product.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyProductDao")
public class ProductDao {
	private static String namespace="product.model.Product";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
}
