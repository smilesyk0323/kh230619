package baekjoon;

import java.util.Scanner;

public class Day13 {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 int count =0;
		 int a;
		 int v; 
		 for(int i = 0; i<N; i++) {
			 a  = sc.nextInt();
			 }
		
	   if(a == v) {
		   count++;
		   v = sc.nextInt();
	      }
			
		System.out.println(count);
		
	}
}
