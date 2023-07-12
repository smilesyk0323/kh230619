package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
	public static void main(String[]args) {
		//끝말 잇기 게임 만들기
		//제시어는 '자바'로 정한 뒤 사용자에게 2~6글자의 한글 단어를 입력받아
		//끝말 잇기 게임을 진행하세요
		//입력한 모든 단어는 기록해두어야 하며 만약 다음 조건에 해당되면 게임오버 처리 
		//여태까지 입력했던 단어들을 순차적으로 출력 
		//-제시어와 이어지지 않는 단어 입력
		//-한글 2~6글자가 아닌 단어 입력
		//-띄어쓰기 허용하지 않음 
		Scanner sc = new Scanner(System.in);
		ArrayList<String>history = new ArrayList<>();
		history.add("자바");
		
		while(true) {
			String given = history.get(history.size()-1);//마지막 기록 추출 
			
			System.out.println(given + "!");
			String input = sc.next();
			
			if(input.matches("^[가-힣] {2,6}$")== false) {
				System.out.println("게임오버");
				break;
			}
			else if(given.charAt(given.length()-1) != input.charAt(0)	) {
				System.out.println("게임오버");
				break;
			}
			else if(history.contains(input)) {
				System.out.println("게임오버");
				break;
			}
			else {
				history.add(input);
			}
		}
		sc.close();
		System.out.println("게임오버");
		
		System.out.println("<기록>")	;
//			for(int i = 0; i < history.size(); i++) {
//				String word = history.get(i);
		for(String word: history ) {
				System.out.println("->"+word);
			}
		
		
	}

}
