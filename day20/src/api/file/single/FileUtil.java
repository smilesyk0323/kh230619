package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	//파일 복사 메소드
	public static void copy(File readTarget, File writeTarget) throws IOException {
		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream writeStream = new FileOutputStream(writeTarget);

		//-1이 들어가면 그만두도록 처리
		while(true) {
			int a = readStream.read();
			if(a == -1) break;
			writeStream.write(a);
		}

		//정리
		readStream.close();
		writeStream.close();
	}
}