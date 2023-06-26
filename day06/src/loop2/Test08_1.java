package loop2;

public class Test08_1 {
		public static void main(String[]args) {
			//현명한 노인 문제 
			
			int money = 1; //1원으로 시작//40일은 long으로 변환
			int total = 0; //합계는 최초 0//40일은 long으로 변환 
			
			for(int day=1; day<=30; day++){
					System.out.println(day + "일자 = " + money +"원");
					total += money; //돈을 누적 시켜라 
					money*=2;
			}
			System.out.println ("총 받는 금액 = "+ total + "원");
		}

}
