package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tet03 {
	public static void main(String[] args) throws IOException {
		//파일복사 프로그램 (바이트 배열 - 버퍼 사용)
		
		//배열 준비 
		byte[] buffer = new byte[10];
		
		//대상 준비 
		File readTarget = new File("경로");
		File writeTarget = new File("경로");
		
		//스트림 준비 
		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
		
		//[읽을파일] --> writeTarget --> readStream ->[프로그램]-> writeStram -> writeTarget-->[내보낼파일]
		
		while(true) {
			int size = readStream.read(buffer);
			if(size == -1) break;
			writeStream.write(buffer, 0 , size);			
		}
		
		//파일 통로 정리 
		readStream.close();
		writeStream.close();
	}
}