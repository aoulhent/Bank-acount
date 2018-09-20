package com.banking;

import java.text.SimpleDateFormat;

public class Account {

	private double balance;
	StringBuilder sb = new StringBuilder();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(Transaction t) {
		 balance += t.getAmount();
		 sb.append("Deposit " + " | " + sdf.format(t.getDateOperation())  + " |  " + t.getAmount() + " | " + balance);
		 sb.append(System.getProperty("line.separator"));
	}
	
	public void withdraw(Transaction t) {
		 balance -= t.getAmount();
		 sb.append("withdraw" + " | " + sdf.format(t.getDateOperation()) + " | -" + t.getAmount() + " | " + balance);
		 sb.append(System.getProperty("line.separator"));
	}

	public void checkOperations() {
		sb.insert(0, "Type OP  |    Date    |  Amount | Balance" + System.getProperty("line.separator"));
		System.out.println(sb.toString());
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
