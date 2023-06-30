package study;

import java.util.Scanner;

public class Day09_2 {
		public static void main(String[]args) {
			
			int[] data = new int[5];
			Scanner sc = new Scanner(System.in);
			
			for(int i =0; i< data.length; i++) {
				data[i] = sc.nextInt();
			}
			
			for(int i=0; i<data.length; i++) {
				if(data[i]<60) {
					System.out.println(data[i]);
				}
				else {
					break;
				}
			}
		}
}
