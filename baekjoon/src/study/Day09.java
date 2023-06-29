package study;

import java.util.Random;

public class Day09 {
	public static void main(String[]args) {
		//주사위를 5번씩 6회 던진 결과를 저장한 뒤 
		//(1) 회차별 주사위 던진 결과를 출력하시고
		//(2) 모든 주사위 값의 평균을 출력하세요
		
		Random r = new Random();
		int[][] dice = new int[6][5];
		
		for(int i= 0; i< dice.length; i++) {
			for(int k =0; k< dice[i].length; k++) {
				  dice[i][k] = r.nextInt(6)+1;
			}
		}
		int count = 0;
		
		int[] totalList = new int[ dice.length ];
		float[] avgList = new float[dice.length];
		
			 for(int i = 0; i< dice.length; i++) {
				 for(int k = 0; k< dice[i].length; k++) {
					 	totalList[i] += dice[i][k];
				 }
				 avgList[i] = (float)totalList[i]/ dice[i].length;
			 }
			 for(int i = 0; i < avgList.length; i++) {
				 System.out.println((i+1) + "회차 평균 = "+ avgList[i]);
			 }
		
				for(int i = 0; i < dice.length; i++) {
				System.out.print( i+1+"번 "+"\t");
					for(int k= 0; k < dice[i].length; k++) {
							System.out.print(dice[i][k]);
							System.out.print("\t");
					}
					System.out.println();
			}
		
	}
}
