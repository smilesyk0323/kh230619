package array;

public class Test03 {
	public static void main(String[]args) {
		//'1.5', '2.4' . '3.6' 을 저장하기 위한 배열 생성하고 데이터를 저장한 뒤 출력하세요 
		//배열 생성 
		//a -------->[0.0][0.0][0.0]
		double[] a = new double[3];
		
		a[0] = 1.5;
		a[1] = 2.4;
		a[2] = 3.6;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//'자바','파이썬', '루비'를 저장하기 위한 배열을 생성하고 데이터를 저장한 뒤 출력 하세요 
		//생성
		//b -----> [null][null][null]//참조형은 null이 기본값 
		String[] b = new String[3];
		//초기화(대입)
		b[0] = "자바";
		b[1] = "파이썬";
		b[2] = "루비";
		//출력
	    System.out.println(b[0]);
	    System.out.println(b[1]	);
	    System.out.println(b[2]);
		
	}
	
}
