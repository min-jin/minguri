package talk.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyTalkDao")
public class TalkDao {
	private static String namespace="talk.model.Talk";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<Talk> TalkList() {
		List<Talk> list=null;
		list=sqlSessionTemplate.selectList(namespace+".TalkList");
		return list;
	}
	
}
