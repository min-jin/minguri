package opinion.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyOpinionDao")
public class OpinionDao {
	private static String namespace="opinion.model.Opinion";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<Opinion> selectById(String id) {
		List<Opinion> list=null;
		list=sqlSessionTemplate.selectList(namespace+".selectById", id);
		return list;
	}
}
