package loop;


public class Test03 {
	public static void main(String[]args) {		
		//1부터 100사이 홀수 출력 

		//for(1부터 99까지 2씩 늘어나도록)
		//조건은 커버리지 반복은 디버그로 확인 
		//for(int i =1; i <= 99; i+=2) {
			//System.out.println(i);
		for(int i=1; i <= 100; i++) {
			if(i % 2 != 0) {//i가 홀수면 
				System.out.println(i);
			}
		}
		
	}
}
