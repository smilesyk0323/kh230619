package array3;

import java.util.Random;

public class Test05 {
	public static void main(String[]args) {
		//주사위를 5번씩 6회 던진 결과를 저장한 뒤 
		//1.회차별 주사위 던진 결과를 출력 하시고 
		//2.모든 주사위 값의 평균을 출력하세요 
		
		int[][] dice = new int[6][5];
		
		//for(int i = 0; i<dice.length;i++) {
		//	for(int j= 0; j< dice[i].length; j++) {
				
		//	}
		//}
		Random r = new Random();
		
		//1번에 5번 던졌을때 
		//int[] dice = new int[5];
		for(int j = 0; j<dice.length; j++) {
			System.out.print((j+1)+"번 ");
			for(int i = 0; i<dice[j].length; i++) {
					int result = r.nextInt(6)+1; 
					System.out.print(result);
				}
			System.out.println("\t");
		}

	     for(int j = 0; j< dice.length; j++) {
	    	 for(int i = 0; i<dice[j].length; i++) {
	    		 //int result2 = r.nextInt(6)+1;
	    	 }

	     }
	}

}
