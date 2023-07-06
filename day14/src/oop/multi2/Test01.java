package oop.multi2;

public class Test01 {
	
	public static void main(String[]args) {
		
		//Electronic d = new Drone();업캐스팅은 정해진 주제에 따라 달라질 수 있다 
		// 해당 기능만 작동! 범위가 맞지 않기에 나머지는 작동 안됨 
		//ex)전자제품 하나만 만들어라
		//상속관계 아닌 것은 업캐스팅이 불가 
		
		
		Drone d = new Drone();
		
		  d.fly();
		  d.power();
		  d.powerOff();
		  d.move();
		  
//		  Transportation t = d;//업캐스팅
//-------------------------------------------------------
//		  if(t가 드론일 경우만) {
//		  if(t instanceof Drone) {}
//		  Drone dd = t;//다운캐스팅 불가능 
//		  Drone dd = (Drone)t;//다운캐스팅 가능
		  
		  
		Airplane a = new Airplane();
		a.move();
		a.fly();
		a.reservation();
		
		Train t = new Train();
		t.move();
		t.reservation();
			
		Bus b = new Bus();
		b.move();
		
		Kickboard k = new Kickboard();
		k.move();
		k.power();
		k.powerOff();
		
		
	}

}
