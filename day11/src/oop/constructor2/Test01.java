package oop.constructor2;

public class Test01 {
	public static void main(String[]args) {
		Music a = new Music("그때 그 순간 그대로(그그그)","WSG워너비","WSG워너비1집",104250,91835);
		Music b = new Music("보고싶었어","WSG워너비","WSG워너비1집",83127,90805);
		Music c = new Music("LOVE DIVE","IVE(아이브)","LOVE DIVE",64590,174519);
		Music d = new Music("POP!","나연(TWICE)","IM NAYEON",58826,70313);
	
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
