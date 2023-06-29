package array3;

import java.util.Random;

public class Test05_1 {
	public static void main(String[]args) {
		Random r = new Random();

		//배열 생성
		int[][] diceList = new int[6][5];

		//diceList	-->	diceList[0]		--> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]	
		//				-->	diceList[1]		--> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]
		//				-->	diceList[2]		--> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]	
		//				-->	diceList[3]		--> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]	
		//				-->	diceList[4]		--> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]	
		//				-->	diceList[5]		--> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]	

		for(int i=0; i < diceList.length; i++) {
			for(int k=0; k< diceList[i].length; k++) {
				diceList[i][k] = r.nextInt(6) + 1;
			}
		}

		//회차별 평균 계산
		//= 합계 저장할 변수가 "회차" 개수만큼 있어야 한다
		//int[] totalList = new int[6];
		int[] totalList = new int[diceList.length];
		float[] averageList = new float[diceList.length];

		for(int i=0; i < diceList.length; i++) {
			for(int k=0; k < diceList[i].length; k++) {
				totalList[i] += diceList[i][k];
			}
			averageList[i] = (float)totalList[i] / diceList[i].length;
		}

		for(int i=0; i < averageList.length; i++) {
			System.out.println((i+1) + "회차 평균 = " + averageList[i]);
		}

		//출력
		for(int i=0; i < diceList.length; i++) {
			for(int k=0; k < diceList[i].length; k++) {
				System.out.print(diceList[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}
}
