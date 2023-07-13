package day19_input04;

import java.util.Scanner;

public class Day04_condition5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		
		int speedPay = 30000;
		int Pay = 10000;
		
		if(speed/10==5 ) {
			System.out.println("벌금 " +speedPay+"원입니다");
		}
		else if(speed/10>5) {
			int plusPay=(speed-50)/10 *Pay;
			System.out.println("벌금"+(plusPay+speedPay)+"원입니다	");
			
		}
		else {
			
			System.out.println("벌금이없습니다");
		}
		
		
	}

}
