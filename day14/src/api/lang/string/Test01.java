package api.lang.string;

public class Test01 {
		public static void main(String[]args) {
			//문자열(String)
			
			//생성
			String a = "hello";//기존 방법(클래스의 문법 아님, 특혜)
			
			char[] ch = new char[] {'h','e','l','l','o'};
			String b = new String(ch);
			
			String c = new String("hello");
//			------------------------------------------------------
			System.out.println(a.toString());
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			//기능사용 
			System.out.println(a.length());
			System.out.println(b.length());
			
			//a와 b는 같나?
			System.out.println(a == b);//동일한 객체인지 비교->원시형 (비추천-오해의 소지가 있음)
			System.out.println(a.equals(b));//(중요!!)동등 비교(내용이 같은지 비교, 추천)
		}

}
