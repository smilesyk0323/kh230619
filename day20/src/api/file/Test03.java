package api.file;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {//예외전가
		//파일 또는 디렉터리 생성 / 삭제 
		//(주의) 디렉터리는 비어 있는 것만 삭제 
		
		File target = new File("D:/dummy");
	
		//파일로 만들고 싶다면 createNewFile() 
		//target.createNewFile();
		
		//디렉터리를 만들고 싶다면 mkdir() 또는 mkirs()
//		target.mkdir();// 중간 경로가 없으면 생성을 하지 않는 명령
		target.mkdirs();//중간 경로가 없으면 생성해주는 명령 
		
		//파일이나 디렉터리나 모두 삭제는 동일
		//(주의)디렉터리는 비어 있는 것만 삭제 
		
		target.delete();
	}
}
