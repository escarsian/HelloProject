package com.yedam.object;

//private <-> public

public class Bank {
	private String accountNo; // unique 11-23-1234
	private String owner; // 예금주 홍길동.
	private int balance; // 잔고. 1000
	// 메소드. getter/setter
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}