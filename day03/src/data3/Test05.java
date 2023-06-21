package data3;

import java.util.Calendar;

public class Test05 {
	public static void main(String[]args) {
		//건강검진은 30세 이상인 사람들을 대상으로 2년에 한 번씩 진행합니다.
		//올해가 짝수 해라면, 짝수년도 출생자가 대상이고 
		//올해가 홀수 해라면, 홀수년도 출생자가 대상입니다
		//어떤사람의 출생년도(ex : 1985)를 입력값으로 두고 이사람이 올해 건강검진 대상인지 아닌지 판정하여 출력 
		//Calendar cal = Calendar.getInstance();
	   // int year = cal.get(Calendar.YEAR);

		//int birth = 1985;
		//int age = year - birth +1;
		
		//System.out.println(age);
				
		//boolean subject = age >=30 && age % 2>0 && year>0 || age >=30 && age % 2==0 && year==0;
		
		//System.out.println(subject);
		
		//문제 풀이 
		//결론
		//= 30세이상 && (짝수해이면서 짝수년생 || 홀수해이면서 홀수년생)
		//= condition1 && (condition2 || condition3)
		
		//입력
		int birth = 1985;
		int year = 2023;
		
		//계산
		int age = year - birth +1; //나이;
	    boolean condition1 = age >= 30; //30세 이상인가;
		boolean condition2 = year % 2 ==0 && birth % 2 ==0;//짝수년도이면서(&&) 짝수년생인가;
		boolean condition3 = year % 2 >0 && birth % 2 >0;//홀수년도이면서 홀수년생인가;
		
		boolean condition = condition1 && (condition2 || condition3);
				
		
		//출력 
		System.out.println(condition);
						
	}
}
