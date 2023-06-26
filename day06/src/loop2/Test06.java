package loop2;

public class Test06 {
	public static void main(String[]args) {
		//누적 합계 구하기 
		//(Q) 10을 10번 더하면 얼마

		
		//int total = 10  + 10 + 10 + ...+ 10
	   int total = 0;
	   //total += 10; //더해 넣어라 
	   for(int i =0; i <10; i++) {
		   total += 10;
	   }
	   
	   System.out.println(total);
			//(Q) 1부터 10까지 더하면 얼마 
	   //int total = 1+ 2 +3 + ...+ 10
	   //int total = 0;
	   
	   //total += 1;
	   //total += 2; .... total +=10;
	   
	   //for(int i=1; i <= 10; i++) {
		   //total += i;
	   //}
	    
	   //System.out.println(total);
	   
	   }	
}
