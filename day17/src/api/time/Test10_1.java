package api.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test10_1 {
	public static void main(String[]args) {
		//사용자에게 시작시간과 종료시간을 각각 'HH:mm'형식으로 입력받아//H는 24시간
		//총 이용시간과 이용요금을 출력하세요 
		//이용 요금은 한 시간당 1000원으로 계산으로 출력하세요 
		//LocalTime 클래스는 Duration이라는 클래스 와 관련 있음
		
		//입력 
		String begin = "14:30";
		String end = "19:15";
		
		LocalTime t1 = LocalTime.parse(begin);
		LocalTime t2 = LocalTime.parse(end);
		
		
		Duration duration = Duration.between(t1,t2);
		long time = duration.getSeconds();
		
		long hour = time / 3600;
		long minute = time / 60 % 60;
		
		//요금 계산
		int pricePerHour = 1000;
		float pricePerMinute = pricePerHour / 60f;
		float totalPrice = pricePerMinute * time;
		
		
		System.out.println("이용시간 : " + hour + "시간 " + minute + "분");
		System.out.println("이용요금 : " + totalPrice + "원");
		System.out.println("이용요금 : " + (int)totalPrice + "원");
		System.out.println("이용요금 : " + (int)Math.floor(totalPrice) + "원");
		System.out.println("이용요금 : " + Math.round(totalPrice) + "원");
		System.out.println("이용요금 : " + (int)Math.ceil(totalPrice) + "원");
	

		
	}
	
}
