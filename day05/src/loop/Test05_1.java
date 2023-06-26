package loop;

public class Test05_1 {
	public static void main(String[]args) {
		//1부터 99 사이에 369게임에서 박수 치는 숫자만 필터링 하여 출력
		//homework 03 풀이

		for(int i=1; i <= 99; i++) {
			boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean clap = ten || one;

			if(clap) {
				System.out.println(i);
			}
		}
	}
}

