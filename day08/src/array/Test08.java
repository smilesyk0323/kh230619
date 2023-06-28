package array;

import java.util.Scanner;

public class Test08 {
	public static void main(String[]args) {
		// 학생 5명의 시험 점수를 입력 받아서 저장하고 다음 문제를 푸세요.
		//1.통과하지 못한 학생의 점수만 출력
		//2.우수한 성적(90점 이상)으로 통과한 학생의 점수만 출력
		//3.만약 75점인 학생이 전학을 왔다면 몇 등인지 구해서 출력 
		
		Scanner sc = new Scanner(System.in);
		int [] data = new int [5];

		
		System.out.print("5명의 시험점수: ");
		for(int i =0; i< data.length;i++) {
			data[i] = sc.nextInt();	
	     }
		
		System.out.print("통과못함: ");
		for(int i = 0; i<data.length; i++	) {
			if(data[i]<60) {
                System.out.println(+data[i]);
			}
			

		}
		sc.close();

	}
}
