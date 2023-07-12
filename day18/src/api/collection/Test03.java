package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
		
		//저장소 생성 
		ArrayList<String>list = new ArrayList<>();
		
		//입력도구 생성 
		Scanner sc = new Scanner(System.in);

		 int count = 0;

		 //사용자 입력
		 while(true) {
			 System.out.print("나라이름 입력: ");
			 	String input = sc.next();
			 	
		 //if(저장소에 이미 추가된 이름이라면)	 	
			 		if(list.contains(input)) {
			 			break;
			 		}
			 		list.add(input);
	//		 		count++;
		 }
		 
		 sc.close();
		 
		 System.out.println("게임오버!");
		 System.out.print("입력된 나라이름개수: "+ list.size() +"개");//count보단 size 사용		 		 
		}
}
