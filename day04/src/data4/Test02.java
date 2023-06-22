package data4;

public class Test02 {
	public static void main(String[]args) {
		//문자열(String)
		//- 문자가 모여있는 형태의 데이터 
		//- 참조형 데이터(reference type)
		//- 주문제작 방식으로 처리된다(복잡한 데이터)
		//- 참조변수(ex : 리모컨)가 존재하며 기능(버튼)이 제공된다
		
		String a = "hello";
		System.out.println(a);//hello
		
		//[1] 추가적으로 제공되는 기능이 존재한다
		System.out.println(a.length());//5
		
		//[2] 기본적인 숫자 연산은 안되지만 더하기는 된다
		System.out.println(a + "world");//helloword
		
		System.out.println("a = " + a);//a = hello
		
		//[3] 특수한 기능을 담당하는 글자가 있다
		//(ex) 나는 점심에 "피자"를 먹을 거에요 
		//System.out.println("나는 점심에 "피자"를 먹을 거에요); //오류발생
		String text = "나는 점심에 \"피자\"를 먹을거에요";
		System.out.println(text);//나는 점심에 "피자"를 먹을거에요
		
		//\n은 새로운 줄로 이동하도록 하는 글자이다
		String text2 = "안녕\n하세요";
		System.out.println(text2);//안녕(엔터-줄바꿈)하세요
		
		//String text3 = "김밥		유료	무료";(탭키)
		String text3 = "김밥\t유료\t무료";
		System.out.println(text3);//김밥 유료 무료 
		
	}
}
