package com.banking;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class AccountScenarioSteps {

    private Account account;

    @Given("the Account balance is <account_balance>")
    public void createAccount(@Named("account_balance") double balance) {
        account = new Account(balance);
    }
    
    @Given("A client makes a deposit of <amount_depot> on the date of <date_depot>")
    public void ClientMakesDeposit(@Named("amount_depot") double amount, @Named("date_depot") Date date) {
    	Transaction t = new Transaction(amount, date);
    	account.deposit(t);
    }
    
    @Given("A client makes another deposit of <amount_depot> on the date of <date_depot>")
    public void ClientMakesAnotherDeposit(@Named("amount_depot") double amount, @Named("date_depot") Date date) {
    	Transaction t = new Transaction(amount, date);
    	account.deposit(t);
    }
    
    @Given("The client makes a withrawal of <amount_withraw> on the date of <date_withraw>")
    public void ClientMakesWithrawal(@Named("amount_withraw") double amount, @Named("date_withraw") Date date) {
    	Transaction t = new Transaction(amount, date);
    	account.withdraw(t);
    }

    @When("The client checks the history of operations")
    public void ClientCheksOperations() {
    	account.checkOperations();
    }

    @Then("the account balance should be <newBalance>")
    public void checkMoney(@Named("newBalance") double balance) {
        assertThat(balance, is(account.getBalance()));
    }

}
