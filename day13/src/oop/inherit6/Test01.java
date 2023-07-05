package oop.inherit6;

public class Test01 {
		public static void main(String[]args) {
			Galaxy23 a = new Galaxy23("010-1234","블랙");
			a.show();
			a.call();
			a.sms();
			a.samsungPay();
			a.bixby();
			
			Galaxyfold4 b = new Galaxyfold4("010-5678","화이트");
			b.show();
			b.call();
			b.sms();
			b.samsungPay();
			b.iris();

			Iphone13 c = new Iphone13("010-1111","골드");
			c.show();
			c.call();
			c.sms();
			c.siri();
			c.itunes();
			
			Iphone14 d = new Iphone14("010-2222","레드");
			d.show();
			d.call();
			d.sms();
			d.siri();
			d.facetime();
		}

}
