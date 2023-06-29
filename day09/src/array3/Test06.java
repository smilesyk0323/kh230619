package array3;

import java.util.Random;

public class Test06 {
	public static void main(String[]args) {
		//빙고판 만들기 
		//- 5x5 사이즈가 기본 
		//- 정사각형이며 홀수 크기만 가능 
		//- 1부터 랜덤한 위치에 배치 
		//-한 칸에는 한번의 숫자만 배치 가능합니다. 
		//- 빙고판을 제작한 뒤 출력하세요 
		//-크기도 변경 가능하도록 업그레이드 하세요 
		//-랜덤한 위치에 1부터 숫자를 배치하는 형태 
		
		//배열 생성 
		int size = 3;
		int[][] bingo = new int [size][size]; 

		//데이터 초기화 
		Random r = new Random();		
		for(int i = 1; i <= size*size; i++) {//i--;재추첨 코드 , for의 무효화 코드 
			int x = r.nextInt(size);			
			int y = r.nextInt(size);
			if(bingo[x][y] == 0) {//처음 넣는 자리라면 
			bingo[x][y] = i;
			}
			else {
				i--;
			}
		}

			//출력
			for(int i =0; i< size; i++) {
				for(int k=0; k< size; k++) {
					System.out.print(bingo[i][k]);
					System.out.print("\t");
				}
				System.out.println("\n");
			}
			
			
							
		
		
	System.out.println( );
	// 뽑은 숫자를 5X5 순서로..? 
	// 위치를 랜덤으로 뽑기 
	
		

	
	}
}
