package api.time;

import java.util.Calendar;

public class Test04 {
	public static void main(String[]args) {
		//Calendar의 장점 
		//= 1900년이 기준이 아니기 때문에 일반적인 연도 설정 가능 
		//= 범위를 벗어나도 자동으로 가능한 값으로 변환된다(계산특화)
		
		Calendar c = Calendar.getInstance();
		
		//항목별로 설정 
//		c.set(Calendar.YEAR,2000);//(무엇을, 얼마로)  
//		c.set(Calendar.MONTH,0);//1월이 0부터 시작(주의)
//		c.set(Calendar.DATE, 1);
//		c.set(2000,0,1);
//		c.set(2000, 1,100);
		c.set(2000, 30,1);
		
		//항목별로 추출하여 출력 
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH)+1;//(주의) 월은 0부터 11까지로 관리 됨 
		System.out.println("월 = " +month);

//		int day = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 = " + day);

		int hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println("시 = " + hour);

		int minute = c.get(Calendar.MINUTE);
		System.out.println("분 = " + minute);

		int second = c.get(Calendar.SECOND);
		System.out.println("초 = " + second);
		
	}
}
