package oop.modifier2;

public class Member {
	
	private String name;
	private int year;
	private int count;
	private int money; 
	private int account;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		switch(year) {
		case 1:
		case 2:
		case 3:
		case 5:
		case 10:
		}
		this.year = year;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		
		this.count = count;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money<0) return;
		this.money = money;
	}
	public int getAccount() {		
		return account;
	}
	public void setAccount(int account) {
		if(account<0) return;
		this.account = account;
	}
	
	public Member(String name,int year, int money) {
		this(name,year,1,money,0);
	}
	public Member(String name, int year, int count, int money, int account) {
		this.setName(name);
		this.setYear(year);
		this.setCount(count);
		this.setMoney(money);
		this.setAccount(account);
	}
	
		
	int getResult() {
		return (this.year*12 + 1)*this.money;
	}
	
	int getPayTotal() {
		return this.count*this.money;
	}
	
	int getCountYear() {
		return (this.count-1) / 12;
	}
	
	int getCountMonth() {
		return (this.count-1) % 12;
	}
	
	
	public void show() {
		System.out.println("<적급가입자정보>");
		System.out.println("이름: "+this.name);
		System.out.println("적금기간: "+this.year+"년");
		System.out.println("총 납입기간: " + this.getCountYear()+"년"+this.getCountMonth()+"개월");
		System.out.println("납입회차: "+this.count+"회차");
		System.out.println("총납입금액: "+this.getPayTotal()+"만원");
		System.out.println("현재총잔액: "+this.account+"만원");
		if( this.getResult() <= account) {
			System.out.println("만기");
		}
		System.out.println("만기예상금액: "+ this.getResult()+"만원");
		System.out.println();		
	}		
}
