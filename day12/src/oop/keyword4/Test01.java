package oop.keyword4;

public class Test01 {
	public static void main(String[]args) {
		int result = Robot.square(11);
		System.out.println("result = "+ result);
		
		double result2 = Robot.triangle(3,7);
		System.out.println("result2 = "+ result2);
		
		double result3 = Robot.circle(5);
		System.out.println("result3 = "+result3);
		
		
		//(주의) 참조형 데이터는 리모컨만 전달하면 외부에서 직접 제어 가능 
		int[] data = new int[] {30,50,20,10,40};
		Robot.sort(data);//리모컨 전달(call-by-reference)
		//참조형 데이터는 모야이 많이 다르다 특히 배열
		

		Robot.reverse(data);
		for(int i= 0; i < data.length; i++) {
		System.out.print(data[i]);
		System.out.print("\t");
		}
		System.out.println();
		
	
		Robot.shuffle(data);
		for(int i =0; i< data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
	}
}
