package com.java.cms;

public class Wallet {

	private int custId;
	private int walletId;
	private double walAmount;
	private WalSource walSource;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public double getWalAmount() {
		return walAmount;
	}
	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}
	public WalSource getWalSource() {
		return walSource;
	}
	public void setWalSource(WalSource walSource) {
		this.walSource = walSource;
	}
	@Override
	public String toString() {
		return "Wallet [custId=" + custId + ", walletId=" + walletId + ", walAmount=" + walAmount + ", walSource="
				+ walSource + "]";
	}
	
	
}
