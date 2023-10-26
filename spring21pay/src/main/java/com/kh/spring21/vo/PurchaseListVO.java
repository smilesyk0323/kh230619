package com.kh.spring21.vo;

import java.util.List;

import lombok.Data;

//묶음
@Data
public class PurchaseListVO {
	private List<PurchaseVO> product;//전달되는 객체 이름이 product이기 때문에! 
}
