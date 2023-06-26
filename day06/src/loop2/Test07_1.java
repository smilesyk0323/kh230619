package loop2;

public class Test07_1 {
	public static void main(String[]args) {
		//다이어트 계획
		//1. 30일 동안 매일 하루에 20개씩 푸시업을 한다 
		//2.30일동안 첫날은 10개, 둘째날부터는 3개씩 늘려가며 푸시업을 한다 
		//1번과 2번에 대한 각각의 푸시업 개수 합계를 구하여 출력하세요 
		
		int total = 0;
		for(int day = 1; day<=30; day++) {
			//System.out.println("일차 : 20개 ");
			total += 20;
		}
		System.out.println("합계 = "+ total);
		
		int pushUp = 10; //시작은 10개 
		int total2 = 0;//위치중요 
		
		for(int day = 1; day <=30; day++) {
			//int pushUp = day * 3 + 7 ;//비추천(복잡)
			//int pushUp = 10 + (day - 1) * 3;//비추천(복잡)
			System.out.println(day +"일자" + pushUp +"개");
			total2 += pushUp; //(위치중요)total을 pushUp 개수만큼 증가 처리 
			pushUp += 3; //3개씩 증가 
		}
			System.out.println("총 푸시업 개수 =" +total2+"개");
		 
	}
}