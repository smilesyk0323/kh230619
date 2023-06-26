package loop2;


public class Test04 {
	public static void main(String[]args) {
		//소수 탐색 프로그램 
		// 소수는 나누기가 어려운 숫자 
		// 1과 자기 자신 빼고 나누어 떨어지는 숫자가 없다
		//소수가 아니다 = 1과 자기자신을 제외하고 나누어 떨어지는 수가 있다 
		
		//사용자가 2 이상의 어떤 숫자를 입력했을 때 소수인지 아닌지 판정하여 출력 
		//소수 탐색 프로그램 
		
			//입력  
		   int number = 7;
		   
		   int count = 0;
		   
		   for(int i = 1; i <=number; i++) {
			   if(number % i == 0 ) {// (2) 그 나눈 값이 0 이 된 값을 세기 
			   		//System.out.println(number % i);//(1)숫자를 본인 수 만큼 나누기 
			   		count++;
			   		}			   
		   }
		   System.out.println("number = " + number);
		   System.out.println("count = " + count);
		   
		   if(count ==2) {// (3) 0을 카운팅한 수가 2면 소수! 
			   System.out.println("소수입니다");
		   }
		   else {
			   System.out.println("소수가 아닙니다");
		   }
	}
}
