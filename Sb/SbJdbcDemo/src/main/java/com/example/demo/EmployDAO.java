package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class EmployDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Employ searchEmploy(int empno) {
		String sql = "select * from Employ where empno=?";
	    return jdbcTemplate.query(sql,new Object[] {empno}, new ResultSetExtractor<Employ>() {
	        public Employ extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	                Employ employ = new Employ();
		            employ.setEmpno(rs.getInt("empno"));
		            employ.setName(rs.getString("name"));
		            employ.setGender(Gender.valueOf(rs.getString("gender")));
		            employ.setDept(rs.getString("dept"));
		            employ.setDesig(rs.getString("desig"));
		            employ.setBasic(rs.getInt("basic"));
		            return employ;
	            }
	            return null;
	        }
	    });

	}
	public List<Employ> showEmploy() {
		String cmd = "select * from Employ";
		List<Employ> listEmploy = jdbcTemplate.query(cmd, new RowMapper<Employ>() {
			 
	        @Override
	        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Employ employ = new Employ();
	            employ.setEmpno(rs.getInt("empno"));
	            employ.setName(rs.getString("name"));
	            employ.setGender(Gender.valueOf(rs.getString("gender")));
	            employ.setDept(rs.getString("dept"));
	            employ.setDesig(rs.getString("desig"));
	            employ.setBasic(rs.getInt("basic"));
	 
	            return employ;
	        }
	 
	    });
	 
	    return listEmploy;

	}

}
