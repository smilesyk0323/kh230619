package condition3;

public class Test04_1 {
	public static void main(String[]args) {
		
		// switch로 풀이(JAVA 11 이하)
		
		//입력
		int year = 2004;
		int month = 4;
		
		//계산
		//int days = 31 or 30 or 28;
		int days;				
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			boolean leapYear = year % 400 == 0|| year % 4 == 0 && year % 100 != 0;
			if(leapYear) {
				days = 29;
			}
			else {
				days = 28;
			}
			break;
		}
			
			//출력 
			System.out.println(days + "일");
		}
	

}
