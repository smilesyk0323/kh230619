package api.file.obfect;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		File target = new File("sample/player.kh");
		if(!target.isFile()) {
			FileInputStream stream2 = new FileInputStream(target);
			BufferedInputStream buffer2 = new BufferedInputStream(stream2);
			ObjectInputStream obj2 = new ObjectInputStream(buffer2);
			
			Player user = (Player) obj2.readObject();
			obj2.close();
		}
		
		else {
			FileOutputStream stream = new FileOutputStream(target);
			BufferedOutputStream buffer = new BufferedOutputStream(stream);
			ObjectOutputStream obj = new ObjectOutputStream(buffer);
			
			
			System.out.println("게임시작");
			System.out.print("아이디를 설정하세요:");
			String id = sc.next();
			obj.writeObject(id);	
			obj.close();
			
		}

		

//		while(true) {
//			if(input ==3) {
//				break;
//			}
//		}
		sc.close();
//
//		Member a = new Member(id, password, nickname);
//		a.show();
	}
}
