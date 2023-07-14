package api.file.single2;

import java.io.File;
import java.io.IOException;

public class Test03_1 {
	public static void main(String[] args) throws IOException {

		//준비물 : 입력용파일+스트림, 출력용파일+스트림
		File readTarget = new File("./sample/single2.kh");//절대경로(absolute path)
		File writeTarget = new File("./sample/copy2.txt");//상대경로(relative path)

		Buffer.copy2(readTarget, writeTarget);
	}
}
