package api.lang.string;

//import java.util.Scanner;

public class Test08 {
		public static void main(String[]args) {
			// 욕설 필터링 프로그램 
			//사용자에게 문장을 입력받아 욕설이 있다면 '*'
			//필터링할 욕설
			//수박씨, 신발끈, 개나리, 십장생, 시베리아,주옥, 조카, 게불, 10원, 
			//Scanner sc = new Scanner(System.in);
			
			String line = "조카 수박씨 신발끈 개나리같은 시베리아!!!";
			
			System.out.print("문장 입력: ");
			//String line = sc.nextLine();
			String[] filter = new String[] {
					 "수박씨", "신발끈","개나리", "십장생","시베리아","주옥","조카","게불","10원"
			};
			
			//sc.close();			
			
			//수박씨만 필터링
			//line.replace("수박씨", "***");
			
			String star = "*";
//			String[] star = new String[] {// 자바11 미만 버전 용 
//					"",
//					"*",
//					"**",
//					"***",
//					"****",
//					"*****",
//					"******"
//				};

			
			for(int i = 0; i < filter.length; i++) {
				int count = filter[i].length();
//				if(count > 6) {// 자바 11 미만 버전용
//					count = 6;
//				}
				line = line.replace(filter[i],star.repeat(count));//repeat는 자바11부터 사용 가능 
			}
			
			System.out.println(line);
			
		}

}
