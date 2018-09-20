package com.banking;

import java.util.Date;

public class Transaction {

	private double amount;
	private Date dateOperation;
	
	public Transaction(double amount, Date dateOperation) {
		this.amount = amount;
		this.dateOperation = dateOperation;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

}
