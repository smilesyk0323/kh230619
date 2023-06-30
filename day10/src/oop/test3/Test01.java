package oop.test3;

public class Test01 {
		public static void main(String[]args) {
			Player p1 = new Player();
			Player p2 = new Player();
			Player p3 = new Player();
			Player p4 = new Player();
			
			p1.rank = 1;
			p1.name = "칼리안 음바페";
			p1.nation = "프랑스";
			p1.goal = 8;
			
			p2.rank = 2;
			p2.name = "리오넬 메시";
			p2.nation = "아르헨티나";
			p2.goal = 7;
			
			p3.rank = 3;
			p3.name = "올리비에 지루";
			p3.nation = "프랑스";
			p3.goal = 4;
			
			p4.rank = 4;
			p4.name = "풀리안 알바레스";
			p4.nation = "아르헨티나";
			p4.goal = 4;
			
			System.out.print("순위: "+p1.rank+" 등"	+"\t");
			System.out.print("이름: "+p1.name	+"\t");
			System.out.print("국가: "+p1.nation +"\t");
			System.out.println("득점골: "+p1.goal+" 개");
			
			System.out.print("순위: "+p2.rank+" 등"	+"\t");
			System.out.print("이름: "+p2.name	+"\t"+"\t");
			System.out.print("국가: "+p2.nation +"\t");
			System.out.println("득점골: "+p2.goal+" 개");
			
			System.out.print("순위: "+p3.rank+" 등"	+"\t");
			System.out.print("이름: "+p3.name	+"\t");
			System.out.print("국가: "+p3.nation +"\t");
			System.out.println("득점골: "+p3.goal+" 개");
			
			System.out.print("순위: "+p4.rank+" 등"	+"\t");
			System.out.print("이름: "+p4.name	+"\t");
			System.out.print("국가: "+p4.nation +"\t");
			System.out.println("득점골: "+p4.goal+" 개");
			
			
		}

}
