package com.banking;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;




public class AccountTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Test
	public void deposit() throws ParseException {
		Account a = new Account(0);
		Transaction t1 = new Transaction(1000, sdf.parse("14/09/2018"));
		a.deposit(t1);
		assertEquals(1000, a.getBalance(), 0.0);
		
		Transaction t2 = new Transaction(700, sdf.parse("15/09/2018"));
		a.deposit(t2);
		assertEquals(1700, a.getBalance(), 0.0);
	}
	
	@Test
	public void withraw() throws ParseException {
		Account a = new Account(2000);
		Transaction t1 = new Transaction(700, sdf.parse("17/09/2018"));
		a.withdraw(t1);
		assertEquals(1300, a.getBalance(), 0.0);
		
		Transaction t2 = new Transaction(500, sdf.parse("18/09/2018"));
		a.withdraw(t2);
		assertEquals(800, a.getBalance(), 0.0);
	}

}
