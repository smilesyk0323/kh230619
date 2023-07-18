package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//문자열 출력
		//= 문자열 출력은 필연적으로 인코딩이 필요 
		//= Writer 계열의 클래스를 사용하여 처리 
		
		File directory = new File("sample");
		directory.mkdirs();
		File target = new File(directory,"string.kh");
//		FileOutputStream stream = new FileOutputStream(target);
		FileWriter fw = new FileWriter(target);//자체 버퍼가 있지만 성능이 좋지 않음 
//		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		BufferedWriter bw = new BufferedWriter(fw);//버퍼의 크기 8192
		
		bw.write("Hello");
		bw.write("\n");
		bw.write("안녕하세요");
		
		//정리 
//		bw.flush();//앞으로 사용 계획 O
		bw.close();//앞으로 사용 계획 X
	}
}
