package data;

public class Test11 {
	public static void main(String[]args) {
		//예제 PC방에서 게임을 9시 40분에 시작해서 12시 25분까지 했습니다. 
		//한시간당 1200원일 때 이용요금과 이용시간을 각각 출력하세요 
		//내 풀이.. 음수해결불가.. 일단 다 분으로 바꿔라~
		//int startHour = 9 , startMIn = 40;
		//int endHour = 12 , endMIn = 25;
				
		//int gameHour = endHour - startHour;
		//int gameMIn = endMin - startMin;
		
		//int totalTime = gameHour * 60 + gameMin;
		
		//int hourPrice = 1200;
		//int minutePrice = hourPrice / 60;
		
		//int totalPrice = minutePrice * totalTime;
		
		//풀이 
		//입력
		int startHour = 9 , startMin = 40;
		int endHour = 12 , endMin = 25;
		int price = 1200;
		
		//계산
		int startTime = startHour * 60 + startMin;
		int endTime = endHour * 60 + endMin;
		
		int useTime = endTime - startTime;
		//System.out.println(useTime);
		
		int useHour = useTime / 60;
		int useMin = useTime % 60;
		
		int pricePerMin = price / 60;
		int usePrice = useTime * pricePerMin;
				
		
		//출력
		System.out.println(useHour);
		System.out.println(useMin);
		System.out.println(usePrice);
	}

}
