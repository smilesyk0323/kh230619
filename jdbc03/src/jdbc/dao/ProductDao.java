package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.util.JdbcUtils;

public class ProductDao {

	public void insert(ProductDto dto) {
		String sql = "insert into product( no, name, type,"
						+ " price, made, expire)"
						+ "values(?,?,?,?,?,?)";
		//DTO가 문자열이면(date가 아니라 문자열이면)=> to_date(?,'yyyy-mm-dd)로 표기 
		Object[] data = {dto.getNo(),dto.getName(),dto.getType(),dto.getPrice(),
								dto.getMade(),dto.getExpire()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql,data);
	}
	
	//삭제 
	public boolean delete(int no) {
		String sql = "delete product where no = ?";
		Object[]data = {no};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data)>0;
	}
}
