package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test09 {
	public static void main(String[]args) {
		//인원수 = 2~4명 입력
		//카드는 4개의 도형(하트, 스페이드, 클로버, 다이아몬드)
		// 각 도형 마다 13카드 (A,2~10,J,Q,K) 존재
		//총 52장 카드가 하나의 덱을 이룸  ( 하트A는 "하트/A"라 표현)
		//카드 랜덤 섞기 
		//카드를 인원수 대로 분배 , 한사람당 3장씩 분배
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String>hList = new ArrayList<>();
		ArrayList<String>sList = new ArrayList<>();
		ArrayList<String>cList = new ArrayList<>();
		ArrayList<String>dList = new ArrayList<>();
//		hList.add();
		
		System.out.println(hList);
		
//		System.out.print("인원수입력:");
//		int count = sc.nextInt();
//		while(true) {
//			if(count<2 || count>4) {
//				System.out.println("인원수는 2~4명만 입력하세요");
//				break;
//			}
//		}
		
		 

	
//		for(int i = 0; i < count; i++) {
//			System.out.println(nameList.get(i)+"-"+itemList.get(i));
//		}
		
	}

}
