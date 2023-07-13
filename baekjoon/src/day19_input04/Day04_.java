package day19_input04;

import java.util.Scanner;

public class Day04_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		int out = sc.nextInt();
		
		int inHour = in / 100;
		int inMin = in  % 100;
		
		int outHour = out /100;
		int outMin = out % 100;
		
		int inTotal = inHour * 60 + inMin;
		int outTotal = outHour * 60 + outMin;
		
		int useTime = outTotal - inTotal;
		
		System.out.println("총이용시간은"+useTime/60+"시"+useTime%60+"분");
	}

}
