package study;

import java.util.Scanner;

public class Day09_1 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		double[] data = new double[5];
		
			for(int i = 0; i < data.length; i++) {
				data[i] = sc.nextDouble();
			}
			
			for(int i =0; i < data.length; i++) {
				System.out.println(data[i]);
			}
	}
}
