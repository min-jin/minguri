package product.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("productDao")
public class ProductDao {
	
	private final static String namespace = "product.model.Product";	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public ProductDao() {
		
	}
	
	//변수(pnum)로 총 갯수 파악해서 ProductListController로 보내기
	public int GetTotalCount(Map<String, String> map) {
		
		int cnt = -1;
		cnt = sqlSessionTemplate.selectOne(namespace+".GetTotalCount", map);
		return cnt;
	}

	//제품 리스트 모아서 보내기
	public List<Product> GetDataList(Paging pageInfo, Map<String, String> map) {
		
		List<Product> lists = new ArrayList<Product>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		lists = sqlSessionTemplate.selectList(namespace+".GetDataList", map, rowBounds);
		return lists;
	}
	
	//DB에 데이터 입력
	public Integer InsertData(Product product) {
		
		Integer cnt = -1;
		cnt = sqlSessionTemplate.insert(namespace+".InsertData", product);
		return cnt;
		
	}

	public Product GetData(int pnum) {
		
		Product product = null;
		product = sqlSessionTemplate.selectOne(namespace+".GetDataList", pnum);
		return product;
	}

	public Integer UpdateData(Product product) {

		Integer cnt = -1;
		cnt = sqlSessionTemplate.update(namespace+".UpdateData", product);
		return cnt;
	}

	public int DeleteData(int pnum) {
		
		int cnt = -1;
		cnt = sqlSessionTemplate.delete(namespace+".DeleteData", pnum);
		return cnt;
	}
	
}
