package baekjoon;

import java.util.Scanner;

public class Day01 {
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			for(int i =1; i <= T; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				int result = A + B;
			    System.out.println( result);
			}
						
			sc.close();			
						
		}

}
