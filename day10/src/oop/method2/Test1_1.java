package oop.method2;

public class Test1_1 {
	
		public static void main(String[]args) {
			Player2 p1 = new Player2();
			Player2 p2 = new Player2();
			Player2 p3 = new Player2();

			
			p1.setup1("진종오", "사격", "하계", 4, 2, 0);
			p2.setup1( "김수녕","양궁","하계",4, 1,1);
			p3.setup1( "전이경", "쇼트트랙","동계", 4, 0, 1);

			
			p1.show1();
			p2.show1();
			p3.show1();

	}

}
