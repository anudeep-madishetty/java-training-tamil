package com.core.java.session;

//Bank Account Information
public abstract class Account {

	private int balance;
	public static final int interestRate = 10;

	//balance amount
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	public int getInterestRate() {
		return interestRate;
	}

	abstract void setInterestRate(int interestRate);
	
}
