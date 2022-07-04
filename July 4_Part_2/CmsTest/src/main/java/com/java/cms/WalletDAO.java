package com.java.cms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class WalletDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Wallet searchByWalletType(String walType,int cusId) {
		String cmd = "select * from wallet where wal_source=? and Cus_ID=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, new Object[] {walType,cusId},  new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setCustId(rs.getInt("Cus_ID"));
				wallet.setWalletId(rs.getInt("WAL_ID"));
				wallet.setWalSource(WalSource.valueOf(rs.getString("WAL_SOURCE")));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				return wallet;
			}
		});
		return walletList.get(0);
	}
	public Wallet searchByWalletId(int walletId) {
		String cmd = "select * from wallet where WAL_ID=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, new Object[] {walletId},  new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setCustId(rs.getInt("Cus_ID"));
				wallet.setWalletId(rs.getInt("WAL_ID"));
				wallet.setWalSource(WalSource.valueOf(rs.getString("WAL_SOURCE")));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				return wallet;
			}
		});
		return walletList.get(0);
	}
	public List<Wallet> showCustomerWallet(int custId) {
		String cmd = "select * from wallet where CUS_ID=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, new Object[] {custId},  new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setCustId(rs.getInt("Cus_ID"));
				wallet.setWalletId(rs.getInt("WAL_ID"));
				wallet.setWalSource(WalSource.valueOf(rs.getString("WAL_SOURCE")));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				return wallet;
			}
		});
		return walletList;
	}
}
