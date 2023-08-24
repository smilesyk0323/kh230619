package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BasketDto {//장바구니
	private int basketNo;
	private String basketUser;
	private int basketItem;
	private Date basketTime;
	private int basketQty;
}
