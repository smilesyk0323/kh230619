package day22;


import java.util.Scanner;

public class While_test04 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 100;
			
		int count=0;
		while(true) {
			
			int input = sc.nextInt();
				count++;
				a -= input;
			
			 if(a<=0) {
				break;
			}
		}
					
		sc.close();
		System.out.println("게임오버");
		System.out.println("시행횟수"+ count	);
	}	
}
