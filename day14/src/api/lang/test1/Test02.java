package api.lang.test1;

import java.util.Properties;

public class Test02 {
	public static void main(String[]args) {
		//객체 생성 
		Properties prop = new Properties();
		
		//기능사용 
		//-key=hello, -value=world 인 데이터 저장 
		prop.setProperty("hello", "world");
		prop.setProperty("good", "bye");
		
		//객체의 요약 정보 = toString()
		System.out.println(prop.toString());
		
		//- key=hello 인 데이터의 value를 확인 
		String value = prop.getProperty("hello");
		System.out.println(value);
	}

}
