package api.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Test09 {
	public static void main(String[]agrs) {
		//사용자에게 날짜를 'yyyy-MM-dd'형식으로 입력받아
		//다음을 계산하여 출력하시오
		//1. 100일 / 200일 / 300일 / 1주년/ 2주년/ 10주년 
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		sc.close();
		LocalDate day = LocalDate.parse(input);
		
		//System.out.println(day);
		
		LocalDate after100 = day.plusDays(100L);
		System.out.println("100일 = "+after100);
		
		LocalDate after200 = day.plusDays(200L);
		System.out.println("200일 = "+after200);
		
		LocalDate after300 = day.plusDays(300L);
		System.out.println("300일 = "+after300);
		
		LocalDate after1Y = day.plusDays(365L);
		System.out.println("1주년 = "+after1Y);
		
		LocalDate after2Y = day.plusDays(365L*2);
		System.out.println("2주년 = "+after2Y);
		
		LocalDate after10Y = day.plusDays(3650L);
		System.out.println("10주년 = "+after10Y);
		
		
	}

}
