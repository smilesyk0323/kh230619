package array;

public class Test13 {
	public static void main(String[]args) {
	// 30,50,20,10,40 이라는 데이터가 저장된 배열이 있을때
	// 배열의 데이터 위치를 완전히 반대로 뒤집어 보세요 
	// 뒤집은 다음 데이터를 출력 
		
		int[]data = new int[] {30,50,20,10,40};
		
		//[0]과 [4]를 교체 
		int backup = data[0];
		data[0] = data[4];
		data[4] = backup;
		//[1]과 [3]을 교체 
		backup = data[1];//int는 만들때 사용/ int없이 사용가능
		data[1] = data[3];
		data[3] = backup;
		
	
		//for(int i= data.length -1; i>= 0; i--){ // 이러면 반대로 출력
		for(int i= 0; i < data.length; i++) {
		System.out.println(data[i]);
		}
	}	
}
