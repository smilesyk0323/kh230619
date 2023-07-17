package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tet03 {
	public static void main(String[] args) throws IOException {
		//파일복사 프로그램 (바이트 배열 - 버퍼 사용)
		
		//배열 준비 
		byte[] buffer = new byte[8192];
		
		//대상 준비 ([1]운영체제가 거부하는 위치인 경우)
		//String home = System.getproperty("user.home");//[1]
		File readTarget = new File("D:/origin.txt");//home,나머지경로
		File writeTarget = new File("sample/copy3.txt");//home,나머지경로 
		
		//스트림 준비 
		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
		
		//[읽을파일] --> writeTarget --> readStream ->[프로그램]-> writeStram -> writeTarget-->[내보낼파일]
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int size = readStream.read(buffer);
			if(size == -1) break;
			writeStream.write(buffer, 0 , size);			
		}
		
		long finish = System.currentTimeMillis();
		long duration = finish - start;
		System.out.println("소요시간 = " + duration + "ms");
		
		//파일 통로 정리 
		readStream.close();
		writeStream.close();
	}
}