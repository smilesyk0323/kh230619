package jdbc.app;

import jdbc.dao.CustomerDao;
import jdbc.dto.CustomerDto;

public class Test01 {
	public static void main(String[] args) {
		
		CustomerDto dto = new CustomerDto();
		dto.setCustomerId("testuser6");
		dto.setCustomerContact("010-1232-9874");
		dto.setCustomerJoin("2023-04-11");
		dto.setCustomerPurchase("2023-07-10");
		dto.setCustomerMileage(0);
		dto.setCustomerLevel("일반");
		
		CustomerDao dao = new CustomerDao();
		dao.insert(dto);
		System.out.println("등록완료");
	}
}
