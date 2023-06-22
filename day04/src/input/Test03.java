package input;

import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
		//사용자에게 다음 정보를 입력받아 '총점(tot)'과 '평균(avg)'을 구하여 출력
		//-국어 점수(kor)
		//-영어 점수(eng)
		//-수학 점수(mat)
		Scanner sc = new Scanner(System.in);
		
		//int kor = sc.nextInt();
		//int eng = sc.nextInt();
		//int mat = sc.nextInt();
		
		//int tot = kor + eng + mat;
		//double avg = (kor + eng + mat) / 3d;
		
		//System.out.println("tot = "+ tot );
		//System.out.println("avg = "+ avg);
		
		//풀이 
		
		//입력
		
		System.out.print("국어점수입력:");
		int kor = sc.nextInt();
		System.out.print("영어점수입력:");
		int eng = sc.nextInt();
		System.out.print("수학점수입력:");
		int mat = sc.nextInt();
		
		sc.close();
		
		//계산
		int tot = kor + eng + mat;
		//float avg = tot / 3f;
		float avg = (float)tot / 3;
		
		//출력 
		System.out.print("<계산 결과>");
		System.out.println();
		System.out.println("총점 = " + tot);
		System.out.println("평균 = " + avg);
		
	}
}
