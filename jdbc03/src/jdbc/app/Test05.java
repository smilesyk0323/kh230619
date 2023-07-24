package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
		public static void main(String[] args) {
			
			ProductDto dto = new ProductDto();
			dto.setNo(11);
			dto.setName("빈츠");
			dto.setType("과자");
			dto.setPrice(2500);
			dto.setMade(Date.valueOf("2022-07-01"));
			dto.setExpire(Date.valueOf("2022-07-30"));
			
			ProductDao dao = new ProductDao();
			dao.insert(dto);
			System.out.println("등록완료");
			
		}
}
