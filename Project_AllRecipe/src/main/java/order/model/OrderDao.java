package order.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyOrderDao")
public class OrderDao {
	private static String namespace="order.model.Order";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
}
