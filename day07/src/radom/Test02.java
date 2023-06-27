package radom;

import java.util.Random;

public class Test02 {
		public static void main(String[]args) {
			//무작위 로또 번호 1개 
			// 무작위 두자리 정수 1개
			// 무작위 OTP 번호 1개 (총 6자리)
			//무작위 앞/뒤 출력
			//무작위 가위/바위/보 출력
			//컨트롤 쉬프트 C :자동 주석 
					
			Random r = new Random();
			
			//int lotto = 1부터 45개 중 하나; 
			int a = r.nextInt(45)+1; 
			System.out.println("로또번호 :"+a);
			
			//int number = 10부터 99까지 중 하나> 10부터 90개 중 하나 
			// B -A +1 = 나이 구하는 공식
			int b = r.nextInt(90)+10;
			System.out.println("두자리 정수: "+ b);
			
			//otp 번호 총 6자리 
			//int otp = 0부터 1000000개;
			//int otp = r.nextInt(1000000)+0;
			int c = r.nextInt(1000000);
			System.out.println("OTP번호:"+c);
			
			//(약속) 앞 = 0, 뒤 = 1
			//int d = 0부터 2개중 하나;
			int d = r.nextInt(2);
			//System.out.println("앞/뒤:"+d);
			if(d==0) {
				System.out.println("동전 = 앞");
			}
			else {
				System.out.println("동전 = 뒤");
			}
			
			//(약속) 가위 = 0 , 바위 = 1, 보 = 2
			//int e = 1부터 3개 중 하나 ;
			int e = r.nextInt(3);
			System.out.println("가위/바위/보: "+ e);
			if(e==0) {
				System.out.println("가위가 나왔습니다");
			}
			else if(e==1) {
				System.out.println("바위가 나왔습니다");
			}
			else if(e==2) {
				System.out.println("보가 나왔습니다");
			}
		}

}
