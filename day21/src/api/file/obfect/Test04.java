package api.file.obfect;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;


public class Test04 {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			//test 02에서 생성한 로또 번호 확인 		
			File target = new File("sample/lotto.kh");
			
			FileInputStream stream = new FileInputStream(target);
			BufferedInputStream buffer = new BufferedInputStream(stream);
			ObjectInputStream obj = new ObjectInputStream(buffer);
			
			@SuppressWarnings("unchecked")//안적어도 상관없음
			Set<Integer> lotto = (Set<Integer>) obj.readObject();//제너릭 타입을 적으면 경고 "<Integer>"써도 상관없음
			obj.close();
			
			
			
			for(int number : lotto) {
				System.out.println(number);
				
			}
			
			
		}

}
