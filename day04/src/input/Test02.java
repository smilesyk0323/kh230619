package input;

import java.util.Scanner;//딱하나만(Scanner) 쓰겠다
//import java.util.*;//다 불러온다

public class Test02 {
	public static void main(String[]args){
		//Scanner 도구를 이용한 입력 예제 
		//-사용자가 입력한 글자를 모아서 원하는 형태로 반환하는 도구 
		//- 기본 제공 도구가 아니므로 생성하여 사용해야 한다
		
		//생성코드
		Scanner sc = new Scanner(System.in);//new:새로만들어라 sc 이름은 짓기나름
		
		int a = sc.nextInt();//숫자를 알아서 입력받아 a에 저장해!
		System.out.println("a=" + a);
		
		int b = sc.nextInt();
		System.out.println("b = " + b);
		
		long c = sc.nextLong();
		System.out.println("c = " + c);
		
		float d = sc.nextFloat();
		System.out.println("d =" + d);
		
		double e = sc.nextDouble();
		System.out.println("e =" +e);
		
		//다 썻으면 정리 
		sc.close();
		
	}
}
