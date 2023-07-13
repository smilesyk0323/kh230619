package day19_input04;

import java.util.Scanner;

public class Day04_condition02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int birth = sc.nextInt();
		
		int year = 2023;
		
		int pass = year - birth +1;
		
		if(pass==19) {
			System.out.println("이벤트대상입니다");
		}
		else {
			System.out.println("이벤트 대상이 아닙니다");
		}
	}

}
