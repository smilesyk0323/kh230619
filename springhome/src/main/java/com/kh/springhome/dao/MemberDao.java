package com.kh.springhome.dao;

import com.kh.springhome.dto.MemberDto;

//메소드 명세만 작성(책으로치면 목차)
public interface MemberDao {
		void insert(MemberDto memberDto);
		MemberDto selectOne(String memberId);
		boolean updateMemberLogin(String memberId);
		boolean updateMemberPw(String memberId, String changePw);
		boolean updateMemberInfo(MemberDto memberDto);
		boolean deleteMemberExit(String memberId);
		
		//포인트 증가 
//		boolean updateMemberPoint(String memberId);//무조건10p
		boolean increaseMemberPoint(String memberId, int point);//다른값이 설정될 여지가 있다면
//		boolean decreaseMemberPoint(String memberId, int point);//포인트 사용시
	}
