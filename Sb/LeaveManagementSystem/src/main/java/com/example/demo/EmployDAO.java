package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDAO {


	@Autowired 
    JdbcTemplate jdbcTemplate;  
	
	public Employee searchEmploy(int empno) {
		String cmd = "select * from Employee where Emp_ID=?";
		List<Employee> menuList=jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee employ = new Employee();
				employ.setEmpId(rs.getInt("Emp_ID"));
				employ.setEmpName(rs.getString("EMP_NAME"));
				employ.setEmpDateOfJoin(rs.getDate("EMP_DT_JOIN"));
				employ.setEmpEmail(rs.getString("EMP_MAIL"));
				employ.setEmpMobile(rs.getString("EMP_MOB_NO"));
				employ.setEmpDptName("EMP_DEPT");
				employ.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
				employ.setEmpLeaveBalance(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
//				employ.setEmpno(rs.getInt("empno"));
//				employ.setName(rs.getString("name"));
//				employ.setGender(Gender.valueOf(rs.getString("gender")));
//				employ.setDept(rs.getString("dept"));
//				employ.setDesig(rs.getString("desig"));
//				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
		});
		if (menuList.isEmpty()) {
			return null;
		}
		return menuList.get(0);
	}
	public List<Employee> showEmploy() {
		String cmd = "select * from Employee";
		List<Employee> menuList=jdbcTemplate.query(cmd, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee employ = new Employee();
				employ.setEmpId(rs.getInt("Emp_ID"));
				employ.setEmpName(rs.getString("EMP_NAME"));
				employ.setEmpDateOfJoin(rs.getDate("EMP_DT_JOIN"));
				employ.setEmpEmail(rs.getString("EMP_MAIL"));
				employ.setEmpMobile(rs.getString("EMP_MOB_NO"));
				employ.setEmpDptName("EMP_DEPT");
				employ.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
				employ.setEmpLeaveBalance(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
//				employ.setEmpno(rs.getInt("empno"));
//				employ.setName(rs.getString("name"));
//				employ.setGender(Gender.valueOf(rs.getString("gender")));
//				employ.setDept(rs.getString("dept"));
//				employ.setDesig(rs.getString("desig"));
//				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
		});
		return menuList;
	}
}
