package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LeaveDetailsService {

	@Autowired
	LeaveDetailsDAO ldao;
	
	public LeaveDetails searchByLeaveId(int leaveId) {
		return ldao.searchByLeaveId(leaveId);
	}
	
	
}
