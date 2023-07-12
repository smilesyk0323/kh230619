package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08 {
	public static void main(String[]args) {
		//네이버 사다리 만들기 
		//1.인원수 입력 2.이름및 항목입력 3. 당첨 결과 출력 
		//인원수 = 항목 scanner 로 입력값 받기 (반복문 횟수?)
		// 이름 LIst  항목 LIst (인원수 만큼 이름 리스트와 항목 리스트 작성)
		//이름 List 하나와 항목 List 하나를 랜덤 매칭
		
		Scanner sc = new Scanner(System.in);
		List<String>nameList = new ArrayList<>();//Array list를 List로 업캐스팅하여 사용 
		List<String>itemList = new ArrayList<>();
		
		
		System.out.print("인원수입력:");//사다리게임에서 인원 범위 확인! 2~24명
		int count = sc.nextInt();
		sc.nextLine();//엔터 제거 int 다음엔 nextLine 입력 불가 
		
		for(int i = 0; i < count; i++) {
			System.out.print("이름입력:");
			String name = sc.nextLine();//띄어쓰기가 가능하기에 nextLine으로 입력받기
			nameList.add(name);			
		}
				
		for(int i = 0; i < count; i++) {
			System.out.print("항목입력:");
			String item = sc.nextLine();
			itemList.add(item);			
		}
		
//		System.out.println(nameList);
//		System.out.println(itemList);
		
		Collections.shuffle(itemList);
		
		
	
		for(int i = 0; i < count; i++) {
			System.out.println(nameList.get(i)+"-"+itemList.get(i));//nameList는 순서가 바뀌지 않는다 
		}
				
		
//		System.out.println()
		
		
		sc.close();
		
		
	}

}
