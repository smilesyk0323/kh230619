package array;

import java.util.Random;

public class Test09 {
	public static void main(String[]args) {
		//로또 시뮬레이션 
		//로또 번호  중에서 가장 많이 나오는 번호를 찾으려는 목적으로 랜덤을 이용하여 
		//로또 번호를 1000번정도 추첨하려고 합니다. 
		//1.각 번호(1~45)가 몇번 나왔는지 측정하여 출력하세요 
		//2. 가장 많이 나온 번호를 찾아서 출력하세요 
		//힌트 힘들면 주사위로 바꿔서... 
		
		Random r = new Random();
		
		int count = 0;
		int count2 =0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		//int[] randomNumber = new int[6];
		
		for(int i = 0; i <1000; i++) {
		int a = r.nextInt(6)+1;
		
			if( a==1) { 
				count++;
				}
			else if(a == 2){
				count2++;
				}
			else if(a == 3){
				count3++;
				}
			else if(a == 4){
				count4++;
				}
			else if(a == 5){
				count5++;
				}
			else if(a == 6){
				count6++;
				}
		
		
		}
		System.out.println("1이나온횟수:"+ count );
		System.out.println("2이나온횟수:"+ count2 );
		System.out.println("2이나온횟수:"+ count3 );
		System.out.println("2이나온횟수:"+ count4 );
		System.out.println("2이나온횟수:"+ count5 );
		System.out.println("2이나온횟수:"+ count6 );
		
		
		
		
	}
	
}
