package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[]args) {
		//사용자에게 실수 5개를 입력받아서 출력하도록 프로그램 구현 
		
		Scanner sc = new Scanner(System.in);
		
		double[] data = new double[5];// double data [] 도 가능!->C언어방식
		
		System.out.println("실수 5개를 입력하시오");
		for(int i = 0; i< data.length; i++) {
			
			data [i] = sc.nextDouble();
			
		}
			//sc.close();
			
			for(int i =0; i<data.length;i++) {
				System.out.println(data[i]);
			}
		//사용자에게 나라이름 5개를 입력받아서 출력하도록 프로그램 구현 
			String[] data2 = new String[5];
			
			System.out.println("나라이름 5개를 입력하시오");
			for(int i = 0; i < data2.length; i++) {//가운데 length 이름 주의! 
				data2[i] = sc.next();// nextString이 아닌 그냥 next!!
			}
			sc.close();
			for(int i = 0; i< data2.length; i++) {
				System.out.println(data2[i]);
			}
			
			
	}
	
}