package oop.modifier2;
//적금계좌 클래스 
public class Member {
	//멤버 필드
	private String name;//예금주명
	private int year;//총 기간
	private int count;//진행된 입금회차
	private int money; //1회 입금액
	private int account;//잔액
	//멤버 메소드 
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
		switch(year) {//들어오는 값에 설정을 넣는
		case 1: case 2: case 3: case 5: case 10:
			this.year = year;
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if(count <1) return;
		if(count > this.getTotalCount()) return;
		this.count = count;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money<=0) return;
		this.money = money;
	}
	public int getAccount() {		
		return account;
	}
	public void setAccount(int account) {
		if(account<=0) return;
		this.account = account;
	}
	
		
	public int getResult() {
		return (this.year*12 + 1)*this.money;
	}
	
	public int getPayTotal() {
		return this.count*this.money;
	}
	
	public int getTotalCount() {
		return this.year*12 +1;
	}
	
	public int getCountYear() {
		return (this.count-1) / 12;
	}
	
	public int getCountMonth() {
		return (this.count-1) % 12;
	}
	//(참고) 논리가 반환값인 Getter 메소드는 get이 아니라 is로 시작하게 작명
	//총 납부횟수랑 현재 납부횟수가 같은지 판정!
	public boolean isFinish() {
		return this.getTotalCount() == this.getCount();
			
	}
	
	//만기 예상 금액 출력 
	//=현재잔고 + 남은 횟수*월부금
	public int getRemainCount() {
		return this.getTotalCount() - this.count;
	}
	
	public int getFuture() {
		return this.account + (this.getTotalCount() - this.count)*this.money;
	}
	
	//1개월이 지나면 변하는 것 = 납입횟수, 잔액
	public void next() {
		if(this.isFinish())return;
		
		this.count++;
		this.account += this.money;
	}
	
	//생성자 - 반드시 입력해야하는 설정값
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
	
	
	public void show() {
		System.out.println("<적금가입자정보>");
		System.out.println("예금주: "+this.name);
		System.out.println("적금기간: "+this.year+"년");
		System.out.println("총 납입기간: " + this.getCountYear()+"년"+this.getCountMonth()+"개월");
		System.out.println("납입회차: "+this.count+"회차");
		System.out.println("총납입금액: "+this.getPayTotal()+"만원");
		System.out.println("현재총잔액: "+this.account+"만원");
		//if( this.getResult() <= account) {//만기인지 아닌지는 논리임!! boolean isFinish로 만들어 놓고 사용
			//System.out.println("만기");
		//}
		System.out.println("만기예상금액: "+ this.getResult()+"만원");
		System.out.println();		
	}		
}
