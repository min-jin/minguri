package reply.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyReplyDao")
public class ReplyDao {
	private static String namespace="reply.model.Reply";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;	
}
