package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.util.JdbcUtils;

public class MemberDao {
		
	public void insert(MemberDto dto) {
		String sql = "insert into member(member_id, member_pw, member_nickname,"
						+ "member_birth, member_email, member_contact,"
						+ " member_level, member_join)"
						+ " values(?,?,?,?,?,?,'일반',sysdate)";
		Object[] data = {dto.getMemberId(),dto.getMemberPw(),dto.getMemberNickname(),
							  dto.getMemberBirth(), dto.getMemberEmail(),dto.getMemberContact()
							  	};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql,data);
	}
}
