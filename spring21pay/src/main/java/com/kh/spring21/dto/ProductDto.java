package com.kh.spring21.dto;

import com.kh.spring21.vo.KakaoPayAmountVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ProductDto {
	private int productNo;
	private String productName;
	private int productPrice;
}




















