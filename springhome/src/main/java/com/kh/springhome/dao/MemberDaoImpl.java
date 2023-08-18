package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.mapper.MemberMapper;

@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
		private JdbcTemplate jdbcTemplate;
	
	@Autowired
		private MemberMapper memberMapper;
	
	//회원가입
	@Override
		public void insert(MemberDto memberDto) {
			String sql = "insert into member("
							+ "member_id, member_pw, member_nickname, "
							+ "member_email, member_contact, member_birth, "
							+ "member_post, member_addr1, member_addr2) "
							+ "values(?,?,?,?,?,?,?,?,?)";
			Object[] data = {
					memberDto.getMemberId(), memberDto.getMemberPw(), memberDto.getMemberNickname(),
					memberDto.getMemberEmail(), memberDto.getMemberContact(), memberDto.getMemberBirth(),
					memberDto.getMemberPost(), memberDto.getMemberAddr1(), memberDto.getMemberAddr2()
			};
			jdbcTemplate.update(sql,data);
	    }
	
	
	//로그인처리 가능
	@Override
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id = ?";
		Object[] data = {memberId};
		List<MemberDto>list = jdbcTemplate.query(sql, memberMapper,data);
		return list.isEmpty() ? null : list.get(0);
	}

	//로그인 기록 업데이트
	@Override
	public boolean updateMemberLogin(String memberId) {
		String sql = "update member "
				+ "set member_login=sysdate "
				+ "where member_id = ?";
		Object[] data = {memberId};
		return jdbcTemplate.update(sql,data)>0;
	}

	//비밀번호 변경
	@Override
	public boolean updateMemberPw(String memberId, String changePw) {
		String sql = "update member "
							+ "set member_pw=?, member_change=sysdate "
							+ "where member_id=?";
		Object[] data = {changePw, memberId};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//회원정보변경
	@Override
	public boolean updateMemberInfo(MemberDto memberDto) {
		String sql = "update member set "
						+ "member_nickname=?, member_contact=?,"
						+ "member_email=?, member_birth=?,"
						+ "member_post=?, member_addr1=?, member_addr2=?, member_change=sysdate  "
						+ "where member_id=?";
		Object[] data = {
			memberDto.getMemberNickname(), memberDto.getMemberContact(),
			memberDto.getMemberEmail(), memberDto.getMemberBirth(), 
			memberDto.getMemberPost(), memberDto.getMemberAddr1(), 
			memberDto.getMemberAddr2(), memberDto.getMemberId()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}

	//회원 탈퇴 
	@Override
	public boolean deleteMemberExit(String memberId) {
		String sql = "delete member where member_id = ?";
		Object[] data = {memberId};
		return jdbcTemplate.update(sql,data)>0;
	}

	//회원 포인트 증가
	@Override
	public boolean increaseMemberPoint(String memberId, int point) {
		String sql = "update member "
							+ "set member_point = member_point + ? "
							+ "where member_id =?";
		Object[] data = {point, memberId};
		return jdbcTemplate.update(sql,data) > 0;
	}
		
}


















