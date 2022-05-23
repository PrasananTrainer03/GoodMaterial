package com.example.demo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveDetailsController {

	@Autowired 
	LeaveDetailsDAO dao;
	
	@PostMapping("/approveDeny/{leaveId}/{managerId}/{status}/{managerComments}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String acceptOrReject(@PathVariable int leaveId,@PathVariable int managerId, 
			@PathVariable String status, @PathVariable String managerComments) {
		return dao.approveDeny(leaveId, managerId, status, managerComments);
	}
	
	@PostMapping("/applyLeave")
	@CrossOrigin(origins = "http://localhost:4200")
	public String add(@RequestBody LeaveDetails leaveDetails) {
		return dao.applyLeave(leaveDetails);
	}
	
	@RequestMapping("/searchByLeaveId/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public LeaveDetails searchEmploy(@PathVariable int id) {
		return dao.searchByLeaveId(id);
	}
	
	@RequestMapping("/leaveHistory/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<LeaveDetails> leaveHistory(@PathVariable int id) throws SQLException {
		return dao.leaveHistory(id);
	}
	
	@RequestMapping("/pendingLeaves/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<LeaveDetails> pendingLeaves(@PathVariable int id) throws SQLException {
		return dao.pendingLeaves(id);
	}
	
}
