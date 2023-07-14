package api.file;

import java.io.File;

public class Test01 {
		public static void main(String[] args) {
			//파일(file) 제어 
			//- 파일은 무엇인가? 			글자를 저장하는 저장소 
			//										파일이 크다는 것은 보관하는 글자가 많다는 소리
			//										글자 하나 당 1byte (자바에서 byte로 사용)
			//- 폴더는 무엇인가?			파일을 구분하기 위한 장치 
			//										디렉터리(directory)라고 부름
			//										크기가 없음(내부파일의 합계)
			//- 자바에서 파일과 폴더는 어떻게 처리하는가?
			//										java.io패키지 (블로킹 방식)<--배울 내용!
			//										java.nio패키지 (논블로킹 방식) - 대용량 데이터 처리할때 
			
			//File 클래스 객체 생성 
			File a = new File("D:/test.txt");
			File b = new File("D:/","test.txt");
			
			//파일 정보를 분석 
			System.out.println(a.exists());//진짜 있냐? //true
			System.out.println(b.exists());
			
			System.out.println(a.isDirectory());//디렉터리야?
			
			System.out.println(a.isFile());//파일이야?
			
			if(a.isFile()) {
				System.out.println(a.getName()	);//이름이?? //text.txt
				System.out.println(a.getPath());//위치가 어디? //D:\test.txt
				System.out.println(a.length());//파일의 크기(=들어있는 글자의 개수)반환형이 long//5
				System.out.println(a.lastModified());//최종 수정 시각//1689300395144
			}
			
	}
}
