package talk.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyTalkDao")
public class TalkDao {
	private static String namespace="talk.model.Talk";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<TalkContainer> TalkList(int offset) {
		List<TalkContainer> list=new ArrayList<TalkContainer>();
		RowBounds rowBounds=new RowBounds(offset, 5);
		list=sqlSessionTemplate.selectList(namespace+".TalkList", null, rowBounds);
		return list;
	}

	public TalkContainer containerByTid(int tnum) {
		TalkContainer talkContainer=null;
		talkContainer=sqlSessionTemplate.selectOne(namespace+".containerByTid", tnum);
		return talkContainer;
	}
	
}
