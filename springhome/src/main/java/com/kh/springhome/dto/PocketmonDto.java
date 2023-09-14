package com.kh.springhome.dto;

import lombok.Data;

@Data
public class PocketmonDto {
	private int no;
	private String name; 
	private String type;
	private boolean image;//이미지유무 = DB미포함
}
