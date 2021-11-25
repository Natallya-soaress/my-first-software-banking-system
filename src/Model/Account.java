package Model;

import java.util.Date;

public class Account {

	private int number;
	private int accountPassword;
	private int type;
	private double balance;
	private double loanLimit;
	private Date creationDate;
	
	public Account() {
	}

	public Account(int number, int accountPassword, int type, double balance, double loanLimit, Date creationDate) {
		this.number = number;
		this.accountPassword = accountPassword;
		this.type = type;
		this.balance = balance;
		this.loanLimit = loanLimit;
		this.creationDate = creationDate;
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

	public void setLoanAmount(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public String checkBalance() {
		return "Your balance is: " + getBalance();
	}
	
	public void makeDeposit(double value) {
		balance += value;
	}
	
	public void makeWithdraw(double value) {
		balance -= value;
	}
	
	
	public void makeLoan(double value) {
		if(value <= loanLimit) {
			makeDeposit(value);
		}
	}
	
	public void makeTransfer(Account destination, double value) {
		makeWithdraw(value);
		destination.makeDeposit(value);
	}
	
	public void generateHistory() {
	}
}
