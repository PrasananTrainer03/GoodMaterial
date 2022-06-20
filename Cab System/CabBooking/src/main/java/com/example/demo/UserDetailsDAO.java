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
	
	public Booking searchBooking(int bookingId) {
		String cmd = "select * from booking where bookingId=?";
		List<Booking> listUsers=jdbc.query(cmd, new Object[] {bookingId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BookingId"));
				booking.setBookingDate(rs.getDate("bookingDate"));
				booking.setUserId(rs.getInt("userId"));
				booking.setDriverId(rs.getInt("driverId"));
				booking.setStartingLocation(rs.getString("startingLocation"));
				booking.setEndingLocation(rs.getString("endingLocation"));
				booking.setKilometers(rs.getInt("kilometers"));
				booking.setBookingStatus(rs.getString("bookingStatus"));
				booking.setBookingAmount(rs.getDouble("BillAmount"));
				return booking;
			}
			
		});
		return listUsers.get(0);

	}
	
	public List<Booking> userBooking(int userId) {
		String cmd = "select * from booking where userid=?";
		List<Booking> listUsers=jdbc.query(cmd, new Object[] {userId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BookingId"));
				booking.setBookingDate(rs.getDate("bookingDate"));
				booking.setUserId(rs.getInt("userId"));
				booking.setDriverId(rs.getInt("driverId"));
				booking.setStartingLocation(rs.getString("startingLocation"));
				booking.setEndingLocation(rs.getString("endingLocation"));
				booking.setKilometers(rs.getInt("kilometers"));
				booking.setBookingStatus(rs.getString("bookingStatus"));
				booking.setBookingAmount(rs.getDouble("BillAmount"));
				return booking;
			}
			
		});
		return listUsers;
		
	}
	
	public String bookRide(Booking booking) {
		String cmd = "Insert into Booking(BookingDate,userId,driverId,startingLocation,"
				+ " endingLocation,kilometers,bookingStatus,billAmount) "
				+ " values(?,?,?,?,?,?,?,?)";
		jdbc.update(cmd, new Object[] {booking.getBookingDate(),booking.getUserId(),
				booking.getDriverId(), booking.getStartingLocation(), 
				booking.getEndingLocation(), booking.getKilometers(), 
				booking.getBookingStatus(), booking.getBookingAmount()});
		return "Waiting for Confirmation...";
	}
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
