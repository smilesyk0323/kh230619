package com.kh.spring21.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayApproveRequestVO {
	private String cid, tid, partnerOrderId, partnerUserId, pgToken;
}










