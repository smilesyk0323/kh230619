package com.kh.spring17.vo;


import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberComplexSearchVO {
	private String memberId,memberNickname,memberEmail,
				memberContact, memberPost,memberAddr1,memberAddr2;
	private String memberBirthBegin, memberBirthEnd ;
	private String birthYear;   
	private String birthMonth;  
	private String memberJoinBegin, memberJoinEnd;//날짜도 검색할 때는 문자열로 입력
	private String memberLoginBegin, memberLoginEnd;
	private String memberChangeBegin, memberChangeEnd;
	private Integer memberPointMin, memberPointMax;
	private List<String> memberLevelList;
	private List<String> orderList;
	private Integer begin;
	private Integer end;
}
