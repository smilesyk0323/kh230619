package loop;

public class Test04 {
	public static void main(String[]args) {
		//1부터 99 사이에 5가 포함되어 있는 숫자만 필터링하여 출력 
		//homework02 풀이 
		
		//풀이 
		
		for(int i = 1; i<=99; i++) {// 문제의 숫자를 최대한 활용하여 풀이 
			//if(i/10 == 5|| i % 10 == 5) {
				//System.out.println("i = " + 1);
			//}
			boolean ten = i / 10 == 5;
			boolean one = i % 10 == 5;
			boolean five = ten || one; 
			
			if(five) {
				System.out.println( " i = " + i);
			}

		}
	
			
		
	}

}
