package loop3;

import java.util.Scanner;

public class Test05 {
		public static void main(String[]args) {
			//숫자 모래성 땅따먹기 
			//최초에 100이라는 값을 정해두고 사용자에게 한자리 숫자(1~9)를 입력받아 차감합니다. 
			//차감을 하다가 0 이하가 되면 반복을 종료하고 게임 오버 메세지 출력 
			//몇번만에 게임 오버가 되었는지 측정하여 출력 
			
			// 풀이 
			 int number = 10;
			 
			 Scanner sc = new Scanner(System.in);
			 
			 int count = 0;
			 
			 
			 while(true) {
				 
				 System.out.print("1~9입력:");
				 	int input = sc.nextInt();
			 
				 	if(input >= 0 && input <= 9) {
			 
				 		count++;
			 
				 		number -= input;//차감 처리 
			 
				 		System.out.println("남은 숫자: "+number);
			 
				 		if(number <= 0) {//남은 숫자가 0 이라할면 반복을 중지(게임오버)
				 				break;
				 						}
				 		}
			 	}
			 sc.close();
			 
			 System.out.println("게임오버!");
			 System.out.println("총입력횟수는 "+ count+"번");
		}

}
