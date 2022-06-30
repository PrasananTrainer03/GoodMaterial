package com.java.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String updateEmploy(Employ employ) {
		Employ employFound = searchEmploy(employ.getEmpno());
		if (employFound!=null) {
			String cmd = "Update Employ set Name=?, Gender=?, Dept=?, Desig=?, Basic=? "
					+ " Where Empno=?";
			jdbcTemplate.update(cmd, new Object[] {employ.getName(), employ.getGender().toString(),
					employ.getDept(), employ.getDesig(), employ.getBasic(), employ.getEmpno()
				});
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
	public String deleteEmploy(int empno) {
		Employ employ = searchEmploy(empno);
		if (employ!=null) {
			String cmd = "Delete from Employ where empno=?";
			jdbcTemplate.update(cmd, new Object[] {empno});
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}
	public String addEmploy(Employ employ) {
		String cmd = "Insert into Employ(name,gender,Dept,Desig,Basic) values(?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {employ.getName(), employ.getGender().toString(),
				employ.getDept(), employ.getDesig(),employ.getBasic()
			});
		return "Employ Record Inserted...";
	}
	
	public Employ searchEmploy(int empno) {
		String cmd = "select * from Employ where empno=?";
		List<Employ> employList = jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employ>() {

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
		if (employList.size()==1) {
			return employList.get(0);
		}
		return null;
	}
	public List<Employ> showEmploy() {
		String cmd ="select * from Employ";
		List<Employ> employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

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
		return employList;
	}
	
}
