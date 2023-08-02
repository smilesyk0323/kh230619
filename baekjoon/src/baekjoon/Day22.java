package baekjoon;

import java.util.Scanner;

public class Day22 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] data = new int[n];
			
		for(int i =0; i<data.length; i++) {
		data[i] = sc.nextInt();
		}

		sc.close();
		
		for(int k=data.length-2; k >= 0; k--) {
			for(int i=0; i <= k; i++) {
				if(data[i] > data[i+1]) {
					int backup = data[i];
					data[i] = data[i+1];
					data[i+1] = backup;
				}
			}
		}
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.println();
			
		}		
	}	
}