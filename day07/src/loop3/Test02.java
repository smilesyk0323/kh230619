package loop3;

import java.util.Random;

public class Test02 {
	public static void main(String[]args) {
		//while 의 활요 ㅇ
		//= 주사위가 6이 나올 때까지 던지는 코드 
		
		Random r = new Random();
	  // for(;;){	//아래와 동일한 코드 
		while(true) {
			int dice = r.nextInt(6)+1;
			System.out.println("주사위: "+ dice);
			
			//만약 주사위 값이 6이라면 반복이 종료하도록 조건을 설정(필수)
			if(dice == 6) {
				break;
			}
		}
	}
	
}
