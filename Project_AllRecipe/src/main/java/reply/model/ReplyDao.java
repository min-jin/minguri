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

	public int InsertReply(Reply reply) {
		int cnt=0;
		cnt=sqlSessionTemplate.insert(namespace+".InsertReply", reply);
		System.out.println("InsertReplyCnt:"+cnt);
		return cnt;
	}

	public List<Reply> selectAllReply(Reply reply,int count) {
		List<Reply> list=null;
		RowBounds rowBounds=new RowBounds(count, 10);
		list=sqlSessionTemplate.selectList(namespace+".selectAllReply", reply, rowBounds);
		return list;
	}

	public int replyDelete(int renum) {
		int cnt=0;
		cnt=sqlSessionTemplate.delete(namespace+".replyDelete", renum);
		cnt+=sqlSessionTemplate.delete(namespace+".sonReplyDelete", renum);
		return cnt;
	}

	public int replyReplyInsert(Reply reply) {
		int upCnt=0,reCnt=0;
		upCnt=sqlSessionTemplate.update(namespace+".updateStep", reply);
		System.out.println("upCnt:"+upCnt);
		reCnt=sqlSessionTemplate.insert(namespace+".replyReplyInsert", reply);
		System.out.println("reCnt:"+reCnt);
		return reCnt;
	}

	public int reUpdate(Reply reply) {
		int cnt=0;
		cnt=sqlSessionTemplate.update(namespace+".reUpdate", reply);
		return cnt;
	}

	/*public int deleteAllByTnum(Reply bean) {
		int cnt=0;
		cnt=sqlSessionTemplate.delete(namespace+".deleteAllByTnum", bean);
		return cnt;
	}	*/
}
