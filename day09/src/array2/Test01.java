package array2;

import java.util.Random;

public class Test01 {
		public static void main(String[]args) {
			//정렬(sort)
			//- 여러 개의 데이터를 원하는 목적에 맞게 나열하는 것 
			//- 번호순 , 이름순, 가격순, 랭킹순, 성적순, 최신순 ...
			//- 번호순이라고 하면 번호가 낮은 것부터 나와야 한다 (오름차순)
			//- 성적순이라고 하면 성적이 높은 것부터 나와야 한다 (내림차순)
			//- 정렬 방법은 여러가지가 있으며 상황에 따라 성능이 다르다 
			//- 사용자에게 데이터를 효과적으로 보여주기 위한 수단(반드시 필요)
			
			Random r = new Random();
			
			//데이터 준비 
			int[]data = new int[] {30,50,20,10,40};
			
			//선택 정렬 -1회차(+0부터 +4지점에서 최소값을 찾아 +0지점과 교체)
			for(int k=0; k <data.length-1; k++) {
				
				int minIndex = k;//0번 위치의 값이 가장 작다고 생각 
				for(int i= k+1; i < data.length; i++) {//뒤에 있는 데이터아 비교하여
					if(data[minIndex]>data[i])	{//더 작은 값이 있다면
						minIndex = i;//교체
					}
			}
				//System.out.println("minIndex = "+minIndex);
				int backup = data[minIndex];
				data[minIndex] = data[k];
				data[k] = backup;
				
			}
			//출력 


			
			//0과 제일 작은 위치를 교체 
			
			
		}
}
