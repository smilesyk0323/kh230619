package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Buffer {
	//파일 복사 메소드
	public static void copy2(File readTarget, File writeTarget) throws IOException {
		byte[]buffer = new byte[5];
		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
		
		int size = readStream.read(buffer);
		 writeStream.write(size);
		//정리
		readStream.close();
		writeStream.close();
	}

}
