package com.banking;


import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainBanking {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Transaction t1 = new Transaction(1000, sdf.parse("14/09/2018"));
		Transaction t2 = new Transaction(1500, sdf.parse("15/09/2018"));
		Transaction t3 = new Transaction(5000, sdf.parse("16/09/2018"));
		Account a = new Account(0);
		a.deposit(t1);
		a.deposit(t2);
		a.withdraw(t3);
		a.checkOperations();
	}

}
