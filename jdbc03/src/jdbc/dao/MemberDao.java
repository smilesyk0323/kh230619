package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class MemberDao {
		
	public void insert(MemberDto dto) {
		String sql = "insert into member(member_id, member_pw, member_nickname,"
						+ "member_birth, member_email, member_contact,"
						+ " member_level,member_point, member_join)"
						+ " values(?,?,?,?,?,?,'일반',0,sysdate)";
		Object[] data = {dto.getMemberId(),dto.getMemberPw(),dto.getMemberNickname(),
							  dto.getMemberBirth(), dto.getMemberEmail(),dto.getMemberContact()
							  	};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql,data);
	}
	
	//비밀번호 변경 기능
	//1. 기존비밀번호와 신규비밀번호를 입력받아 검사 후 변경 (권장하지않음)-아이디 비번 새비번
	//2. 임시비밀번호 변경하는 기능
	//3. 아이디에 맞는 계정의 비밀번호를 변경하는 기능 
//		public boolean updateMemberPassword(MemberDto dto, String newPw) {//1번
//		public boolean updateMemberPassword(String memberId) {//2번
//		public boolean updateMemberPassword(String memberId, String memberPw) {//3번
	public boolean updateMemberPassword(MemberDto dto) {//3번
		String sql = "update member "
						+ "set member_pw = ? where member_id = ?";
		Object[] data = {dto.getMemberPw(), dto.getMemberId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	//개인정보 변경
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member "//구문 쓰기에 집중!! 중요!!
				+ "set member_nickname = ?, member_contact = ?, member_email = ?,"
				+ "member_birth = ? where member_id = ?";
		Object[] data = {dto.getMemberNickname(), dto.getMemberContact(),dto.getMemberEmail(),
								dto.getMemberBirth(), dto.getMemberId()};
	
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) >0;
	}
	
	//삭제 기증 
	
	public boolean delete(String memberId) {
		String sql = "delete member where member_id = ?";
		Object[] data = {memberId};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	// 회원 목록 조회 
	
	private MemberMapper mapper = new MemberMapper();
	
	public List<MemberDto>selectList(){
		String sql = "select * from member";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql,mapper);
	}
	
	//회원 목록(+pagination)
	
	public List<MemberDto>selectListByPage(int page, int size){//보이는 회원목록수도 조절 가능(size)
		int end = page * size;
		int begin = end-(size-1);
		String sql = "select * from ("
				+ " select rownum rn, TMP.*from("
				+ " select * from member"
				+ ")TMP"
				+ ")where rn between ? and ?";
		Object[] data = {begin, end};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql,mapper,data);
	}
	
	//회원 상세 조회 
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id = ?";
		Object[]data = {memberId};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<MemberDto>list = jdbcTemplate.query(sql, mapper, data);
//		return list.size() == 0 ? null : list.get(0);
		return list.isEmpty() ? null : list.get(0);
	}
	
}



















