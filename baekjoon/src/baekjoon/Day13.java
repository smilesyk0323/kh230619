package baekjoon;

import java.util.Scanner;

public class Day13 {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 int [] intAry = new int[N];
		 int count =0;
		 int a;
		 int v; 
		 
		 for(int i = 0; i<N; i++) {
			 intAry[i]  = sc.nextInt();
			 }
		 
		 v = sc.nextInt();
		 for(int i = 0; i<N; i++) {
			 if( intAry[i] == v) {
				 count++;
			 }
				
			 }
				
		System.out.println(count);
		
	}
}
