package oop.keyword3.copy;

//문제점
//[1] 내부 구조가 복잡함 - 필드 제거 
//[2] 객체를 꼭 만들어야함 - static 키워드를 추가 
public class Calculator {
	//static 키워가 붙은 메소드는 객체 생성 없이도 호출 가능(메모리 고정)
	public static int plus(int left, int right) {
		return left + right;
	}
}
