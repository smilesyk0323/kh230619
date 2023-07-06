package oop.poly1;

import java.util.Scanner;

public class Test01 {
		public static void main(String[]args) {
	
			Scanner sc = new Scanner(System.in);
			
			int type = 1;
			int action = 1;
			
			//NoteBook notebook = 맥북객체 or 갤럭시북객체;
			Notebook notebook;
			if( type ==1) {
				notebook = new MacBook();//MacBook ---> NoteBook (업캐스팅)
			}
			else {
				notebook = new GalaxyBook();//GalaxyBook ---> NoteBook (업캐스팅)
			}
			
			//notebook에 들어간 객체의 기능을 실행 
			if(action ==1) {
				notebook.power();
			}
			else if(action == 2){
				notebook.video();
			}
			else {
				notebook.typing();
			}
		}

}
