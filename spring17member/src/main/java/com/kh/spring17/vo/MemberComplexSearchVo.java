package com.kh.spring17.vo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberComplexSearchVo {
	private String memberId,memberNickname,memberEmail,
				memberContact, memberPost,memberAddr1,memberAddr2;
	
	private String memberBirthBegin, memberBirthEnd ;
	private Integer memberPointMin, memberPointMax;
	private Date memberJoinBegin, memberjoinEnd;
	private Date memberLoginBegin, memberLoginEnd;
	private Date memberChangeBegin, memberChangeEnd;
	private List<String> memberLevelList;
	private List<String> orderList;
	private Integer begin;
	private Integer end;
}
