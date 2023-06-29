package array2;

public class Test02 {
public static void main(String[]args) {
	//버블 정렬(Bubble sort)
	//- 인접한 두 항복을 비교하여 교체하며 정렬하는 방식 
	//- 
	
	int[] data = new int[] {30,50,20,10,40};
	
		int maxIndex = 0;
		
		for (int i = 0; i <4; i--) {//데이터 0~3 데이터 1~ 비교= 총4번 비교 ) 
			if(data[maxIndex] < data[i+1] ) {
				maxIndex = i+1;
			}
		}
		
		int backup = data[maxIndex];
		data[maxIndex] = data[1];
		data[1] = backup;
		
		System.out.println(maxIndex);
				
		
}
}
