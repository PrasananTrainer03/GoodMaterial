package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DriverDetailsDAO {

	@Autowired  
    JdbcTemplate jdbc;  
	
	public String acceptRejectRide(int bookingId, String status) {
		if (status=="YES") {
			String cmd = "Update Booking set BookingStatus='BOOKED' WHERE BookingId=?";
			jdbc.update(cmd, new Object[] {bookingId});
			return "Booking Confirmed...";
		}
		else {
			String cmd = "Update Booking set BookingStatus='CANCELLED' WHERE BookingId=?";
			jdbc.update(cmd, new Object[] {bookingId});
			return "Booking Cancelled...";
		}
	}
	public String authenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from DriverDetails where DriverUserName=? "
				+ " AND DriverPassword=?";
		List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
	
	public DriverDetails searchByUserName(String userName) {
		String cmd = "select * from DriverDetails where DriverUserName=?";
		List<DriverDetails> listUsers=jdbc.query(cmd, new Object[] {userName},  new RowMapper<DriverDetails>() {

			@Override
			public DriverDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				DriverDetails userDetails = new DriverDetails();
				userDetails.setDriverId(rs.getInt("DriverId"));
				userDetails.setDriverUserName(rs.getString("DriverUserName"));
				userDetails.setDriverPassWord(rs.getString("DriverPassword"));
				userDetails.setDriverFirstName(rs.getString("DriverFirstName"));
				userDetails.setDriverLastName(rs.getString("DriverLastName"));
				userDetails.setDriverCity(rs.getString("DriverCity"));
				userDetails.setDriverState(rs.getString("driverState"));
				userDetails.setDriverMobile(rs.getString("driverMobile"));
				userDetails.setDriverEmail(rs.getString("DriverEmail"));
				userDetails.setCabType(rs.getString("CabType"));
				return userDetails;
			}
			
		});
		return listUsers.get(0);
	}

	
	public DriverDetails searchByUserId(int userId) {
		String cmd = "select * from DriverDetails where DriverId=?";
		List<DriverDetails> listUsers=jdbc.query(cmd, new Object[] {userId}, new RowMapper<DriverDetails>() {

			@Override
			public DriverDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				DriverDetails userDetails = new DriverDetails();
				userDetails.setDriverId(rs.getInt("DriverId"));
				userDetails.setDriverUserName(rs.getString("DriverUserName"));
				userDetails.setDriverPassWord(rs.getString("DriverPassword"));
				userDetails.setDriverFirstName(rs.getString("DriverFirstName"));
				userDetails.setDriverLastName(rs.getString("DriverLastName"));
				userDetails.setDriverCity(rs.getString("DriverCity"));
				userDetails.setDriverState(rs.getString("driverState"));
				userDetails.setDriverMobile(rs.getString("driverMobile"));
				userDetails.setDriverEmail(rs.getString("DriverEmail"));
				userDetails.setCabType(rs.getString("CabType"));
				return userDetails;
			}
			
		});
		return listUsers.get(0);
	}
	public List<DriverDetails> showUserDetails() {
		String cmd = "select * from DriverDetails";
		List<DriverDetails> listUsers=jdbc.query(cmd, new RowMapper<DriverDetails>() {

			@Override
			public DriverDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				DriverDetails userDetails = new DriverDetails();
				userDetails.setDriverId(rs.getInt("DriverId"));
				userDetails.setDriverUserName(rs.getString("DriverUserName"));
				userDetails.setDriverPassWord(rs.getString("DriverPassword"));
				userDetails.setDriverFirstName(rs.getString("DriverFirstName"));
				userDetails.setDriverLastName(rs.getString("DriverLastName"));
				userDetails.setDriverCity(rs.getString("DriverCity"));
				userDetails.setDriverState(rs.getString("driverState"));
				userDetails.setDriverMobile(rs.getString("driverMobile"));
				userDetails.setDriverEmail(rs.getString("DriverEmail"));
				userDetails.setCabType(rs.getString("CabType"));
				return userDetails;
			}
			
		});
		return listUsers;
	}
}
