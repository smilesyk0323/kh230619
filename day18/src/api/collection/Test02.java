package api.collection;

import java.util.ArrayList;

public class Test02 {
	public static void main(String[]args) {
		//List 저장소 
		//= 순서가 있는 저장소 
		//= 선형구조(시작지점과 끝지점이 있는 형태)
		//= ArrayList, LinkedList, Vector
		
		//자료형(Generic Type)을 지정하지 않으면 경고 
		//ArrayList list = new ArrayList();
		
		//자료형을 지정하면서 생성
//		ArrayList<String>list = new ArrayList<String>();//String 전용 저장소
		ArrayList<String>list = new ArrayList<>();//약식 표현
		
		//데이터 추가 
//		list.add(100);//Generic Type과 일치하지 않는 데이터 추가 불가 
		list.add("유재석");//위치는 0
		list.add("이효리");//위치는 1
		list.add("김채원");//위치는 2
		list.add("유태오");//위치는 3
		list.add("지수");//위치는 4
		
		//데이터를 다루는 여러가지 명령들 
		//[1] 저장된 데이터 개수 확인 -->length와 다름! (이미저장된정해진 개수출력)
		System.out.println(list.size());
		
		//[2]특정 데이터 유무 확인 
		System.out.println(list.contains("유재석"));//저장소에 "유재석"이 있습니까? = true
		System.out.println(list.contains("강호동"));//저장소에 "강호동	"이 있습니까? = false
		
		//[3]특정 데이터 위치 확인 
		System.out.println(list.indexOf("유재석"));//저장소에 "유재석"이 있습니까? = 0
		System.out.println(list.indexOf("강호동"));//저장소에 "강호동"이 있습니까? = -1
		
		//[4] 데이터 삭제
		list.remove("지수");
		list.remove(0);//0번 위치 삭제(유재석)

		
		
		//출력 
		System.out.println("list = " + list);
	}

}
