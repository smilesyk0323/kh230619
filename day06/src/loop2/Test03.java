package loop2;

public class Test03 {
	public static void main(String[]args) {
		//1부터 99 사이의 숫자중 369 게임에서 박수치는 숫자의 개수를 구하여 출력 
		int count =0; 
		
			for(int i = 1; i <=99; i ++){
				boolean three = i / 10 == 3 || i % 10 ==3;
				boolean six = i / 10 == 6 || i % 10 == 6;
				boolean nine = i / 10 == 9 || i % 10 == 9;
				boolean clap = three || six || nine;
			
			if(clap) {
			   count ++;
		    	}
			}
			System.out.println(count);
	}
}
