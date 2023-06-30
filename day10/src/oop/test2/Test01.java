package oop.test2;

public class Test01 {
		public static void main(String[]args) {
			// Pokemon의 객체(인스턴스)를 생성 
			
			//생성
			Pokemon a = new Pokemon();
			Pokemon b = new Pokemon();
			Pokemon c = new Pokemon();
			Pokemon d = new Pokemon();
			
			//최기화
			a.num = 1;
			a.name = "이상해씨";
			a.kind = "풀";
						
			b.num = 4;
			b.name = "파이리";
			b.kind = "불꽃";
			
			c.num = 7;
			c.name = "꼬부기";
			c.kind = "물";
			
			d.num = 25;
			d.name = "피카츄";
			d.kind = "전기";
			
			System.out.print(a.num+"\t");
			System.out.print(a.name+"\t");
			System.out.println(a.kind);
			
			System.out.print(b.num+"\t");
			System.out.print(b.name+"\t");
			System.out.println(b.kind+"\t");

			System.out.print(c.num+"\t");
			System.out.print(c.name+"\t");
			System.out.println(c.kind);

			System.out.print(d.num+"\t");
			System.out.print(d.name+"\t");
			System.out.println(d.kind);			

			
			
		}

}
