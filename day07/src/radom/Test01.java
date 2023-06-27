package radom;

import java.util.Random;

public class Test01 {
		public static void main(String[]args) {
			//랜덤(Random)
			//- 뭐가 나올지 알 수 없는 형태의 값
			//- 나올 수 있는 범위와 형태를 지정할 수 있어야 한다
			//- (ex :주사위, 1부터 6사이의 정수 / 로또, 1부터 45 사이의 정수)
			//- 도구를 이용해서 원하는 형태가 나오도록 처리 
			
			//랜덤 생성 도구 만들기 
			//Scanner(형태) sc(리모컨/이름은 아무거나도 가능) = new(오른쪽에 있는걸 만들어라) Scanner(System.in-입력통로);
			Random r = new Random();
			
			int a = r.nextInt();//무작위로 int 숫자 한개를 추첨하라!(사용자 입력X)
			System.out.println(" a ="+ a);
			
			int b = r.nextInt(6);// 무작위로 0부터 6개의 int 중 하나를 추첨하라! 
			System.out.println("b= "+ b );
			
			//최종형태 
			//int number = r.nextInt(개수) + 시작값; 
			int dice = r.nextInt(6) + 1;// 1부터 6개의 int중 하나를 추첨하라
			System.out.println("dice =" + dice);
			
		}

}
