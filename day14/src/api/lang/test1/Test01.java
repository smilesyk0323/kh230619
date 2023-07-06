package api.lang.test1;

public class Test01 {
	public static void main(String[]args) {
		
		//StringBuffer 클래스를 문서만 보고 써보기 
		
		//1.객체 생성 
		StringBuffer a = new StringBuffer(10);
		StringBuffer b = new StringBuffer("hello");
		
		//2.메소드 활용 
		a.append("KH정보교육원");
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		System.out.println(a.capacity());	
		System.out.println(b.capacity());
		
		System.out.println(a.length());	
		System.out.println(b.length());
		
		b.reverse();
		System.out.println(b);
		
	}


	
}
