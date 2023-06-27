package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[]args) {
		//업다운 게임 
		//술래가 1~ 1000 사이의 정수 중에서 랜덤으로 하나의 숫자를 정합니다
		//술래가 아닌 사람이 정답을 예측합니다
		//예측한 정답과 실제 정답이 같으면 게임 끝
		//예측한 정답과 실제 정답이 같지 않으면 '업' 또는 '다운'을 외친다
		//업 을 외치는 경우는 예측한 정답보다 실제 정답이 더 큰 수 일 경우 
		//다운을 외치는 경우는 예측한 정답보다 실제 정답이 작은 수 일 경우 
		// 컴퓨터가 술래를 하고, 사용자가 정답을 맞추는 형태의 프로그램을 구현하세요
		//정답을 맞추면 몇 번만에 맞췄는지 카운트 하여 출력
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		

		int count = 0;
		int com = r.nextInt(1000)+1;
		System.out.println(com);
		
		while(true) {
		System.out.print("정답입력: ");
		int user = sc.nextInt();
		
		count++;
		
		if(com<user) {
			System.out.println("다운");
		}
		else if(com>user) {
			System.out.println("업");
		}
		else if(com==user) {
			break;
		}

		}
		sc.close();
		System.out.println(count+"번째로 맞았습니다!");
	
	
	}	
}
