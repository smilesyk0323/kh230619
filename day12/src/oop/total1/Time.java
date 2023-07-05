package oop.total1;

public class Time {
	private int hour;
	private int min;
	private int sec;
	
	public int getHour() {
		return hour*60*60;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min*60;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public Time( int sec){
		this(0,0,sec);
	}
	public Time(int min, int sec){
		this(0,min,sec);
	}
	public Time(int hour, int min, int sec){
		this.hour=(hour);
		this.min = (min);
		this.sec = (sec);
	}
	
	public int getTotalSec() {
		return this.getHour()+this.getMin()+this.getSec();
	}
	
	public int getAgainHour() {
		return this.getTotalSec()/60/60;
	}

	public int getAgainMin() {
		return this.getTotalSec() /60 % 60;
	}
	
	public int getAgainSec() {
		return this.getTotalSec()%60;
	}
	
	
	
	public void show() {
		System.out.println(this.getAgainHour()+"시간"+this.getAgainMin()+"분"+this.getAgainSec()+"초");

	}
}
