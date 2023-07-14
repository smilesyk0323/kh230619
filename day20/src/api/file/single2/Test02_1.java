package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test02_1 {
	public static void main(String[] args) throws IOException {
		//byte를 뭉탱이로 읽는 예제
		//= 크기를 얼마로 할 것인가? 일단 5개씩 읽기
				
		//읽을 수 있는 배열 준비 
		byte[]buffer = new byte[5];//숫자를 바꾸면 읽는 개수가 바뀜
		
		//파일과 스트림을 준비 
		File target = new File("./sample/single2.kh");
		FileInputStream stream = new FileInputStream(target);
		
		//읽기 
		while(true) {
			int size = stream.read(buffer);
			if(size == -1) break;
			System.out.print(size);
			System.out.print("\t");
			System.out.println(Arrays.toString(buffer));
		}
		
		
	}
}





























