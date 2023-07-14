package api.file;

import java.io.File;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//경로 준비 
		System.out.print("입력: ");
		String input = sc.nextLine();
		File a = new File(input);
			
			if(a.isFile()) {//파일이면  이름+확장자+크기 
			System.out.println("파일명: "+ a.getName());
			
			//확장자는 파일의 마지막, 뒤에 있는 값을 말하며 없을 수 있다 
			//(ex) abc.def.ghi면 확장자는 .ghi이다
			int index = a.getName().lastIndexOf(".");
			String extension;
			if(index == -1) {
				extension = "없음";
			}
			else {
				extension = a.getName().substring(index+1);
			}
			System.out.println("확장자 : "+extension);
			System.out.println("크기: "+ a.length()+"byte");
			}
			else if(a.isDirectory()) {//디렉터리면 목록[파일/ 폴더]
				File[]list = a.listFiles();
				for(File file: list) {
					if(file.isFile()) {
						System.out.print("[파일]");
					}
					else {
						System.out.print("[폴더]");
					}
					System.out.println(file.getName());
				}
			}
			else {//없으면
				System.out.println("존재하지 않는 파일 또는 폴더	");
				
	
		   }
		
		sc.close();

		
		
	}
}
