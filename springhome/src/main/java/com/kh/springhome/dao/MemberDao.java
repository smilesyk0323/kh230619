package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.MemberBlockDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.MemberListDto;
import com.kh.springhome.dto.StatDto;
import com.kh.springhome.vo.PaginationVO;

//메소드 명세만 작성(책으로치면 목차)
public interface MemberDao {
		void insert(MemberDto memberDto);
		MemberDto selectOne(String memberId);//mypage=상세
		MemberDto selectOneNick(String memberNickname);//비동기 닉네임검사
		boolean updateMemberLogin(String memberId);
		boolean updateMemberPw(String memberId, String changePw);
		boolean updateMemberInfo(MemberDto memberDto);
		//관리자 회원정보변경
		boolean updateMemberInfoByAdmin(MemberDto memberDto);
		boolean deleteMemberExit(String memberId);
		
		//포인트 증가 
//		boolean updateMemberPoint(String memberId);//무조건10p
		boolean increaseMemberPoint(String memberId, int point);//다른값이 설정될 여지가 있다면
//		boolean decreaseMemberPoint(String memberId, int point);//포인트 사용시
		
		//관리자 목록구현
		int countList(PaginationVO vo);
		List<MemberDto>selectListByPage(PaginationVO vo);
		List<MemberListDto>selectListByPage2(PaginationVO vo);//block 추가 
		
		//차단+해제 기능 (C+D)
		void insertBlock(String memberId);
		boolean deleteBlock(String memberId);
		
		//차단 회원을 확인 (R+R)
		List<MemberBlockDto> selectBlockList();
		MemberBlockDto selectBlockOne(String memberId);
		
		//통계 기능 추가
		List<StatDto> selectGroupByMemberLevel();
		
	}
