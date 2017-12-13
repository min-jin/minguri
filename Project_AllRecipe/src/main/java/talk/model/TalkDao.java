package talk.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyTalkDao")
public class TalkDao {
	private static String namespace="talk.model.Talk";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
}
