package radom;

import java.util.Random;

public class Test04 {
	public static void main(String[]args) {
		Random r = new Random();

		int count =0;
		int count2 =0;
		
		for(int i =1; i<=100; i++) {
			
			int a = r.nextInt(6)+1;
			int b = r.nextInt(6)+1;
			//System.out.println("주사위: " +a +","+b);
			
			if(a==b) {
				//System.out.println("더블");			
				count++;
				int c = r.nextInt(6)+1;
				int d = r.nextInt(6)+1;
				//System.out.println("추가: "+c+","+d);
				if(c==d) {
					//System.out.println("추가더블");
					count2++;
				}
				
			}
		}
				
		      	int totalC= count + count2;
		     
		     	System.out.println("더블 횟수: "+totalC);
		     	//System.out.println("더블이 나올 확률: "+  +"%");
	}
	
}
