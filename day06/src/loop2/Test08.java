package loop2;

public class Test08 {
		public static void main(String[]args) {
			int money =1;
			int total = 0;
			for(int i =1; i <=30; i++) {	
				System.out.println(i+"일차"+money +"원");
				total +=money;
				money *=2;
			}
			
		
			System.out.println("총" + total +"원");
			//System.out.println("40일은 총"+합계+"원");
		}

}
