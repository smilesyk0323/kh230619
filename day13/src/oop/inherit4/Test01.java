package oop.inherit4;

public class Test01 {
	public static void main(String[]args) {
		Mp4 a = new Mp4();
		a.setFilename("파일이름");
		a.setFilesize(351321);
		a.setSpeed(321321);
		a.execute();
		a.forward();
		a.rewind();
		
		Mp3  b = new Mp3();
		b.setFilename("파일이름");
		b.setFilesize(351321);
		b.setDuration(3213215);
		a.execute();
		b.forward();
		b.rewind();
		
		Hwp c = new Hwp();
		c.setFilename("파일이름");
		c.setFilesize(351321);
		c.setPagesize(3213215);
		a.execute();
		c.preview();

		Ppt d = new Ppt();
		d.setFilename("파일이름");
		d.setFilesize(351321);
		d.setPagesize(3213215);
		d.execute();
		d.slideShow();
		
	}
}
