package com.kh.spring21.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PaymentDto {
	   private int paymentNo, paymentPrice;//PG사 결제 가격
	   private int paymentProduct;//구매상품번호
	   private String paymentMember;//구매회원ID
	   private String paymentTid;//PG사 결제 거래 번호
	   private String paymentName;//PG사 결제 상품명
	   private Date paymentTime;
}
