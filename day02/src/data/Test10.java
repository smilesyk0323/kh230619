package data;

public class Test10 {
	public static void main(String[]args) {
		//어제 2시간 45분 공부했고, 오늘 1시간 50분 공부했다 어제오늘 공부한 시간은?
		//내 풀이 
		//int oneHour = 60;
		//int yesterdayStudy = 2 * oneHour + 45;
		//int todayStudy = 1 * oneHour + 50;
		
		//int totalStudytime =  yesterdayStudy + todayStudy;
		
		//System.out.println(totalStudy / oneHour);
		//System.out.println(totalStudy % oneHour);
		
		//풀이
		//시간은 가장 작은 단위로 변환하여 푼다
		//입력
		int yesterdayHour = 2 , yesterdayMin = 45;
		int todayHour = 1, todayMin = 50;
		
		//계산
		int yesterdayTime = yesterdayHour * 60 + yesterdayMin;
		int todayTime = todayHour * 60 + todayMin;
		
		int time = yesterdayTime + todayTime;
		
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		System.out.println(hour);
		System.out.println(minute);
	}
}
