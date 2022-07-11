package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {

	@Autowired 
	CustomerRepository repo;
	
	@Autowired  
    JdbcTemplate jdbc;  
	
	public List<Customer> showCustomer() {
		return repo.findAll();
	}
	
	public Customer searchByCustomerId(int id) {
		return repo.findById(id).get();
	}
	
	
	
	public String customerAuthenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from Customer where Cus_UserName=? "
				+ " AND Cus_Password=?";
		List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
}
