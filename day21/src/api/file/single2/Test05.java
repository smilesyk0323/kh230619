package api.file.single2;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		//파일삭제는 가능하지만 디렉터리는 비어있는 것만 삭제가 가능 
		
		File target = new File("D:/dummy");//안에 파일이 있었지만 삭제됨
		//target.delete();
		
		FileUtil.delete(target);
	}

}
