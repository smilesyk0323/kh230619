package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.CustomerDto;
import jdbc.util.JdbcUtils;

public class CustomerDao {
		public void insert(CustomerDto dto) {
			String sql = "insert into Customer(customer_no,customer_id, "
					+ "customer_contact, customer_join, customer_purchase,"
					+ "customer_mileage, customer_level)"
					+ "values(customer_seq.nextval,?,?,to_date(?,'yyyy-mm-dd'),to_date(?,'yyyy-mm-dd'),?,?)";
			Object[] data = {dto.getCustomerId(), dto.getCustomerContact(),
								dto.getCustomerJoin(), dto.getCustomerPurchase(),
								dto.getCustomerMileage(),dto.getCustomerLevel()};
			
			JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
			jdbcTemplate.update(sql,data);
		}
}
