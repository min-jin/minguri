package procedure.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyProcedureDao")
public class ProcedureDao {
	private static String namespace="procedure.model.Procedure";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
}
