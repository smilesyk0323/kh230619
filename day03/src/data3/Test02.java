package data3;

public class Test02 {
	public static void main(String[]args) {
		//KH편의점에서는 한국 나이로 20세 이상에게만 술, 담배를 팝니다.
		//어떤 사람의 출생년도가 2003년일 때 이 사람에게 술,담배를 팔아도 되는지 판정하여 출력하세요
		//한국 나이는 태어났을 때부터 1살이며, 만 나이와 다릅니다
		//int guest = 2003;
		//int adult = 2004; 
		
		//boolean sell = adult <= guest;
		//System.out.println(sell); false
		
		//성인판정프로그램 풀이 (A부터 B사이의 숫자 개수 구하는 공식=B-A+1)
		//나이 = 올해 - 태어난해 + 1
		
		//입력
		int birth = 2003;
		
		//계산
		int age = 2023 - birth +1;
		
		boolean adult = age >= 20;
		
		//출력
		System.out.println(age);
		System.out.println(adult);
					
	}
}
