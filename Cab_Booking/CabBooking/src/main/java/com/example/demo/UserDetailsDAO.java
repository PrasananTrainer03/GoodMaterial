package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailsDAO {

	@Autowired  
    JdbcTemplate jdbc;  

	public String authenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from UserDetails where UserName=? "
				+ " AND PassCode=?";
		List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
	
	public UserDetails searchByUserName(String userName) {
		String cmd = "select * from UserDetails where UserName=?";
		List<UserDetails> listUsers=jdbc.query(cmd, new Object[] {userName}, new RowMapper<UserDetails>() {

			@Override
			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDetails userDetails = new UserDetails();
				userDetails.setUserId(rs.getInt("UserId"));
				userDetails.setUserName(rs.getString("UserName"));
				userDetails.setPassCode(rs.getString("PassCode"));
				userDetails.setFirstName(rs.getString("FirstName"));
				userDetails.setLastName(rs.getString("lastName"));
				userDetails.setPassCode(rs.getString("passCode"));
				userDetails.setCity(rs.getString("city"));
				userDetails.setState(rs.getString("State"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setMobile(rs.getString("Mobile"));
				return userDetails;
			}
			
		});
		return listUsers.get(0);
	}

	
	public UserDetails searchByUserId(int userId) {
		String cmd = "select * from UserDetails where UserId=?";
		List<UserDetails> listUsers=jdbc.query(cmd, new Object[] {userId}, new RowMapper<UserDetails>() {

			@Override
			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDetails userDetails = new UserDetails();
				userDetails.setUserId(rs.getInt("UserId"));
				userDetails.setUserName(rs.getString("UserName"));
				userDetails.setPassCode(rs.getString("PassCode"));
				userDetails.setFirstName(rs.getString("FirstName"));
				userDetails.setLastName(rs.getString("lastName"));
				userDetails.setPassCode(rs.getString("passCode"));
				userDetails.setCity(rs.getString("city"));
				userDetails.setState(rs.getString("State"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setMobile(rs.getString("Mobile"));
				return userDetails;
			}
			
		});
		return listUsers.get(0);
	}
	public List<UserDetails> showUserDetails() {
		String cmd = "select * from UserDetails";
		List<UserDetails> listUsers=jdbc.query(cmd, new RowMapper<UserDetails>() {

			@Override
			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDetails userDetails = new UserDetails();
				userDetails.setUserId(rs.getInt("UserId"));
				userDetails.setUserName(rs.getString("UserName"));
				userDetails.setPassCode(rs.getString("PassCode"));
				userDetails.setFirstName(rs.getString("FirstName"));
				userDetails.setLastName(rs.getString("lastName"));
				userDetails.setPassCode(rs.getString("passCode"));
				userDetails.setCity(rs.getString("city"));
				userDetails.setState(rs.getString("State"));
				userDetails.setEmail(rs.getString("email"));
				userDetails.setMobile(rs.getString("Mobile"));
				return userDetails;
			}
			
		});
		return listUsers;
	}
}
