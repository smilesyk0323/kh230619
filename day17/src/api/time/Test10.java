package api.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test10 {
	public static void main(String[]args) {
		//사용자에게 시작시간과 종료시간을 각각 'HH:mm'형식으로 입력받아
		//총 이용시간과 이용요금을 출력하세요 
		//이용 요금은 한 시간당 1000원으로 계산으로 출력하세요 
		//LocalTime 클래스는 Duration이라는 클래스 와 관련 있음
		
		String startTime = "12:10";
		String endTime = "14:40";
		
		LocalTime sTime = LocalTime.parse(startTime);
		LocalTime eTime = LocalTime.parse(endTime);
		
		Duration totalTime = Duration.between(sTime, eTime);
		
		
		System.out.println("총 사용시간 = "+ totalTime.toHours());
		
		
		

		
	}
	
}
