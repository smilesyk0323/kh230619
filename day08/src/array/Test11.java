package array;

public class Test11 {
	public static void main(String[]args) {
		//5명의 키 데이터가 다음과 같을때 가장 키가 작은 사람의 위치와 값을 출력 
		//- 데이터 : 150.8 180.2 175.9 162.7 170.3
		
		double [] data = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		
		int small = 0;
		for(int i = 1; i<data.length; i++) {
			if(data[small]>data[i]) {
				small = i;
			}
		}
		System.out.println("가장 작은 키: "+ data[small]+"cm");
		System.out.println("가장 작은 키 위치: "+ (small+1) + "번째");
	}
	
}
