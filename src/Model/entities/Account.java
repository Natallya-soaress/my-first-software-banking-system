package Model.entities;

import java.util.Date;

import Model.exceptions.IncorrectPasswordException;
import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.LoanOverTheLimitException;
import Model.exceptions.NegativeDepositException;

public class Account {

	private int number;
	private int accountPassword;
	private int type;
	private double balance;
	private double loanLimit;
	private Date creationDate;
	private Person person;
	
	
	public Account() {
	}

	public Account(int number, int accountPassword, int type, double balance, double loanLimit, Date creationDate,
			Person person) {
		this.number = number;
		this.accountPassword = accountPassword;
		this.type = type;
		this.balance = balance;
		this.loanLimit = loanLimit;
		this.creationDate = creationDate;
		this.person = person;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String checkBalance() {
		return "Your balance is: " + getBalance();
	}
	
	public void makeDeposit(double value) throws NegativeDepositException {
		if (value <= 0) {
			throw new NegativeDepositException("It is not possible to deposit negative amounts!");
		}else {
		balance += value;
		}
	}
	
	public void makeWithdraw(double value) throws InsuficientBalanceException {
		if(value > balance) {
			throw new InsuficientBalanceException("Insucient balance!");
		} else {
			balance -= value;
		}
	}
	
	
	public void makeLoan(double value) throws NegativeDepositException, LoanOverTheLimitException {
		if(value > loanLimit) {
			throw new LoanOverTheLimitException("Loan above the allowed limit!");
		} else {
			makeDeposit(value);
		}
		
	}
	
	public void makeTransfer(Account destination, double value) throws InsuficientBalanceException, NegativeDepositException {
		makeWithdraw(value);
		destination.makeDeposit(value);
	}
	
	// Método que realiza transferências solicitando senha devido ao valor alto da transferência
	public void makeTransfer(Account destination, double value, int accountPassword) throws InsuficientBalanceException, NegativeDepositException, IncorrectPasswordException {
		if(accountPassword  != getAccountPassword()) {
			throw new IncorrectPasswordException("Incorrect password!");
		} else {
			makeWithdraw(value);
			destination.makeDeposit(value);
		}
	}
	
	public void generateHistory() {
	}
	
	public String toString() {
		return "Name: " +
				person.getName() +
				"\nAccount number: " +
				getNumber() +
				"\nAccount type: Physical" +
				"\nBalance: " +
				getBalance() +
				"\nLoan limit: " +
				getLoanLimit();
				
	}
	
}
