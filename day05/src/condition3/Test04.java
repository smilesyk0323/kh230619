package condition3;

public class Test04 {
	public static void main(String[]args) {
		
		int month = 5;
		int year = 2023;
		
		//윤년 
		
		int yYear = year % 4;
		String reselt2;

		String result;
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				result = "큰달";
			break;
			case 4, 6, 9, 11:
				result = "작은달";
			break;
			default:
				
			result = "2월";
			
		}
		
		System.out.println("해당월은"+result+"입니다");
	}

}
