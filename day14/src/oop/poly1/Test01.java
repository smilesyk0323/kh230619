package oop.poly1;

import java.util.Scanner;

public class Test01 {
		public static void main(String[]args) {
	
			Scanner sc = new Scanner(System.in);
			
			int type = 2;
			int action = 1;
			
			//NoteBook notebook = 맥북객체 or 갤럭시북객체;
			Notebook notebook;
			
			if(type == 1) {
				notebook = new MacBook();
				if(action == 1) {
					notebook.power();
				}
				else if(action == 2) {
					notebook.video();
				}
				else {
					notebook.typing();
				}
			}
			else {
				 notebook = new GalaxyBook();
				if(action == 1) {
					notebook.power();
				}
				else if(action == 2) {
					notebook.video();
				}
				else {
					notebook.typing();
				}
			}
		}

}
