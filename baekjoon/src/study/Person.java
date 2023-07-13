package study;

public class Person {

		private String personName;
		private int personAge;
		private String personJob;
		
		public String getPersonName() {
			return personName;
		}
		public void setPersonName(String personName) {
			if(personName.matches("^[가-힣]{1,2}[가-힣]{1,5}$")){
				this.personName = personName;
			}
		}
		public int getPersonAge() {
			return personAge;
		}
		public void setPersonAge(int personAge) {
			if(personAge>=0) {
				this.personAge = personAge;
			}
		}
		public String getPersonJob() {
			return  personJob;
		}
		public void setPersonJob(String  personJob) {
			if( personJob.matches("^[가-힣a-zA-Z0-9]+$")) {
				this.personJob =  personJob;
			}
		}
		
		public String getAgeLevel() {
			
			if(personAge>=20) {
				return "성인";
			}
			else if(personAge>=14) {
				return "청소년";
			}
			else if(personAge >=8) {
				return "어린이";
			}
			else {
				return "유아";
			}
		}
		
		
		public Person(String name, int age, String job) {
			super();
			this.setPersonName(personName);
			this.setPersonAge(personAge);
			this.setPersonJob("무직");
		}
		
		public void show(){
			System.out.println("이름: "+this.personName);
			System.out.println("나이:"+this.personAge+"("+ this.getAgeLevel() +")");
			System.out.println("직업: "+this.personJob);
		}	
}
