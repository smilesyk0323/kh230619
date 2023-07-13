package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		//List때 만들었던 로또 생성 프로그램 
		
		Random r = new Random();
		
		Set<Integer>	lotto = new TreeSet<>();//정렬이 필요하다면 Tree,아니면Hash
		
		for(int i = 1; i<6; i++) {
			int number = r.nextInt(45)+1;
			lotto.add(number);
		}
		System.out.println(lotto);
		
	}

}
