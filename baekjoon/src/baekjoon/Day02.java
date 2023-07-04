package baekjoon;

import java.util.Scanner;

public class Day02 {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			
			int total = sc.nextInt();
			
			int N = sc.nextInt();
			int total2 = 0;
			for(int i =0; i<N; i++) {
				int price = sc.nextInt();
				int count = sc.nextInt();
				 total2 += price * count;
					
			     }
			 if(total2 == total	) {
				 System.out.println("Yes");
			 }
			 else{
				 System.out.println("No");
				 
			 }
		}

}
