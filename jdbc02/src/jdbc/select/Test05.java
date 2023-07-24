package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class Test05 {
	public static void main(String[] args) {
		
		String sql = "select * from Member order by member_id asc";
		
		MemberMapper mapper = new MemberMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<MemberDto>list = jdbcTemplate.query(sql, mapper);
		
		for(MemberDto dto : list ) {
			System.out.println(dto);
		}
	}
}
