package condition2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
		//지하철 이용 요금 
		//어르신 65세 이상  무료
		//성인 20세 이상 65세 미만  1250원
		//청소년 14세이상 20세 미만 720원
		//어린이 8세 이상 14세 미만 450원
		//영유아 8세미만  무료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.close();
		
		if(age>=65) {
			System.out.println("이용요금은 무료입니다.");
		}
			else if(20 <= age && age < 65){
				System.out.println("이용요금은 1250원입니다.");
			}
				else if(14 <= age && age < 20) {
					System.out.println("이용요금은 720원입니다.");
				}
				else if(8<= age && age < 14) {
					System.out.println("이용요금은450원입니다.");	 
					}
					 else {
							System.out.println("이용요금은 무료입니다.");	 					 					 
					 	}		
			//풀이 
		//요금을 중점을 두고 조건을 둔다면 5가지(나이기준)가 아니라 4가지(금액 기준)를 가지고 만드는게 더 효율적.
		//
	}
}
