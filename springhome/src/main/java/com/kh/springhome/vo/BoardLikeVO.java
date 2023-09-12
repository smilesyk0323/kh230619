package com.kh.springhome.vo;

import lombok.Data;

@Data
public class BoardLikeVO {
		private boolean check;//Y,N(String)=>대신 논리!(boolean) 
		private int count;//숫자
}
