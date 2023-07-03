package baekjoon;

import java.util.Scanner;

public class Day02 {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			
			int total = sc.nextInt();
			
			int N = sc.nextInt();
			
			for(int i =0; i<N; i++) {
				int price = sc.nextInt();
				int count = sc.nextInt();
				
				int total2 = price * count;
				      total2 += N ;
				System.out.println(total2);
			}
		}

}
