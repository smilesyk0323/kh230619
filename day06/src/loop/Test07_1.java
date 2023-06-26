package loop;

import java.util.Scanner;

public class Test07_1 {
 public static void main(String[]args) throws InterruptedException {
	 //타이머 구현 
	 
	 //입력
	 Scanner sc = new Scanner(System.in);
	 int m = sc.nextInt();
	 int s = sc.nextInt();
	 
	 sc.close();
	 
	 //계산
	  int t = m * 60 + s;
	  
	  //출력 
	  for(int i = t; i >= 0; i--) {
		  //System.out.println(i + "초 남았습니다"
		  int min = i /60;
		  int sec = i % 60;
		  System.out.println( min + "분" + sec + "초 남았습니다");
		  
		  //1초 대기 
		  if(i>0) {
			  Thread.sleep(1000);
		  }
	  
	  }
	  
	  System.out.println("알람 시작!");
	  
		 
 }
}
