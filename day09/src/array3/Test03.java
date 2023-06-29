package array3;

public class Test03 {
	public static void main(String[]args) {
		//다음 데이터를 2차원 배열에 저장하고 출력 
		//-'1.5f', '2.5f', '3.6f'
		//-'10.2', '5.3f', '6.5f'
		
		//2차원 실수 배열 생성 및 출력
		
		//data --->  data[0] -->  [0.0f][0.0f][0.0f]
		//		 --->  data[1]  -->  [0.0f][0.0f][0.0f]
		
		//float[][] score = new float[2][3];
		float[][] score = new float[][] {
			{1.5f, 2.5f, 3.6f},
			{10.2f,5.3f,6.5f}
		};
		
		score[0][0] = 1.5f;
		score[0][1] = 2.5f;
		score[0][2] = 3.6f;
		
		score[1][0] = 10.2f;
		score[1][1] = 5.3f;
		score[1][2] = 6.5f;
		
		//2차원 반복문 출력 (+length)
		
		//System.out.println(score.length);//2 
		//System.out.println(score[0].length);//3
		
		for(int i =0; i <score.length; i++) {
			for(int j = 0; j< score[i].length; j++ ) {
				System.out.println(score[i][j]);
			}
		}
		//System.out.print(score[0][0] + "\t");
		//System.out.print(score[0][1]+"\t");
		//System.out.print(score[0][2]+"\t");
		//System.out.println();
		
		//System.out.println(score[1][0]+"\t");
		//System.out.println(score[1][1]+"\t");
		//System.out.println(score[1][2]+"\t");
		
		//Test04
//		다음 데이터를 2차원 배열에 저장하고 출력
//		자바, 스프링, 안드로이드
//		파이썬, 판다스, 장고
		
		
//		String[][] com = new String[2][3];
		String[][] com = new String[][] {
			{"자바", "스프링", "안드로이드"},
			{"파이썬", "판다스", "장고"}
			};
			
		com[0][0] = "자바";
		com[0][1] = "스프링";
		com[0][2] = "안드로이드";
		com[1][0] = "파이썬";
		com[1][1] = "판다스";
		com[1][2] = "장고";
		
//		System.out.println(com[0][0]);
//		System.out.println(com[0][1]);
//		System.out.println(com[0][2]);
//		
//		System.out.println(com[1][0]);
//		System.out.println(com[1][1]);
//		System.out.println(com[1][2]);
		
		
		for(int i =0; i <com.length; i++) {
			for(int j = 0; j< com[i].length; j++ ) {
				System.out.println(com[i][j]);
				System.out.print("\t");
			}
//		System.out.print("\n");
			System.out.println();
			}
	}

}
