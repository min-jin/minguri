package reply.model;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyReplyDao")
public class ReplyDao {
	private static String namespace="reply.model.Reply";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public void InsertReply(Reply reply) {
		int cnt=0;
		cnt=sqlSessionTemplate.insert(namespace+".InsertReply", reply);
		System.out.println("InsertReplyCnt:"+cnt); 
	}

	public List<Reply> selectAllReply(Reply reply,int count) {
		List<Reply> list=null;
		RowBounds rowBounds=new RowBounds(0, 10);
		list=sqlSessionTemplate.selectList(namespace+".selectAllReply", reply, rowBounds);
		return list;
	}

	public int replyDelete(int renum) {
		int cnt=0;
		cnt=sqlSessionTemplate.delete(namespace+".replyDelete", renum);
		return cnt;
	}	
}
