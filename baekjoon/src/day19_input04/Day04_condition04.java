package day19_input04;

import java.util.Scanner;

public class Day04_condition04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행인원");
		int people = sc.nextInt();
		System.out.print("여행일수: ");
		int day = sc.nextInt();
		System.out.print("여행월:");
		int month = sc.nextInt();
		
		int dayPrice = 100000;
		
		
		int discount = dayPrice *25 /100;
		
		int discountPrice = dayPrice - discount;
		int totalPrice = people * day*dayPrice;	
		
		if(month/3==2) {
			int eventPrice = people *day * discountPrice;
			System.out.println("행사적용비용:"+eventPrice+"원");
			System.out.println("원래 가격: "+totalPrice+"원");
		}
		else {
			System.out.println("여행비용"+totalPrice+"원");
		}
		
		
	}

}
