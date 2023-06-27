package radom;

import java.util.Random;

public class Test03 {
	public static void main(String[]args) {
		
		Random r = new Random();
		
		int a = r.nextInt(6);
		if(a==0) {
			System.out.println("빽도");
		}
		else if(a==1) {
			System.out.println("도");
		}
		else if(a==2) {
			System.out.println("개");
		}
		else if(a==3) {
			System.out.println("걸");
		}
		else if(a==4) {
			System.out.println("윷");
		}
		else {
			System.out.println("모");
		}
	}

}
