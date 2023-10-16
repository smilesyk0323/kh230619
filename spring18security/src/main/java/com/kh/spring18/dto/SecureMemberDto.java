package com.kh.spring18.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder//네타 프로그래밍? 상속없이 
public class SecureMemberDto {
	private String memberId, memberPw;
}
