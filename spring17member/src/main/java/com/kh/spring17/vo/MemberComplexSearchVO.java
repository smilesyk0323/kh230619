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
	private String memberJoinBegin, memberJoinEnd;
	private String memberLoginBegin, memberLoginEnd;
	private String memberChangeBegin, memberChangeEnd;
	private Integer memberPointMin, memberPointMax;
	private List<String> memberLevelList;
	private List<String> orderList;
	private Integer begin;
	private Integer end;
}
