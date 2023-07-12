package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
	public static void main(String[]args) {
		//로또 당첨 예상번호 추첨 프로그램
		//보너스 번호를 제외한 6개의 '1~45' 범위 내에서 중복없는 숫자를 추첨한 뒤 저장하고 출력
		// int, long과 같은 원시형은 Generic Type을 사용할 수 없다(null 라는 값을 표현할 수 없기 때문) 
		//ArrayList<int> a = new ArrayList<>();//---->error
		//ArrayList<Integer> b = new ArrayList<>();//-->ok
		
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		
		while(lotto.size()<6) {//		while(lotto의데이터가 6개 미만이라면){
			int number = r.nextInt(45)+1;//		번호를 뽑고 
			if(!lotto.contains(number)) {//		if(저장된 적이 없는 번호라면) {
				lotto.add(number);//			추가하세요;
			}
		}
		
		System.out.println("로또 당첨 예상번호"+lotto);
	}	
}
