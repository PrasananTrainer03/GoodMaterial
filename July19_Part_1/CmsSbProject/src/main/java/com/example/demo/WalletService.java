package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WalletService {

	@Autowired
    private WalletRepository repo;
	
	@Autowired
	private WalletDAO dao;
	
	public Wallet search(int walId) {
		return repo.findById(walId).get();
	}
	
	public List<Wallet> showCustomerWallets(int custId) {
		return dao.showCustomerWallets(custId);
	}
}
