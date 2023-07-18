package baekjoon;

import java.util.Scanner;

public class Day22 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			int a;
			int b;
			for(int i = 0; i < t; i++) {
				  a = sc.nextInt();
				  b = sc.nextInt();
				  System.out.println("Case #"+i+": "+ a +" + "+b+" = "+(a+b));
			}

		sc.close();	
	}
}
