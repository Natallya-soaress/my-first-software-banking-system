package Model.factory;

import java.util.Date;

import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.LoanOverTheLimitException;
import Model.exceptions.NegativeValueException;
import Model.interfaces.AccountInterface;

public class PhysicalAccount implements AccountInterface{

	private String number;
	private String accountPassword;
	private float balance;
	private float loanLimit;
	private Date creationDate;
	private PhysicalPerson person;
	
	public PhysicalAccount(String number, String accountPassword, float balance, float loanLimit, Date creationDate,
			PhysicalPerson person) {
		this.number = number;
		this.accountPassword = accountPassword;
		this.balance = balance;
		this.loanLimit = loanLimit;
		this.creationDate = creationDate;
		this.person = person;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(float loanLimit) {
		this.loanLimit = loanLimit;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public PhysicalPerson getPerson() {
		return person;
	}

	public void setPerson(PhysicalPerson person) {
		this.person = person;
	}
	
	@Override
	public void makeDeposit(String accountNumber, String accountPassword, double value) throws NegativeValueException {
		if (value <= 0) {
			throw new NegativeValueException("It is not possible to deposit negative amounts!");
		}else {
		balance += value;
		}
	}
	
	@Override
	public void makeDeposit(double value) throws NegativeValueException {
		if (value <= 0) {
			throw new NegativeValueException("It is not possible to deposit negative amounts!");
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
	
	@Override
	public void makeWithdraw(String accountNumber, String accountPassword, double value) throws InsuficientBalanceException {
		if(value > balance) {
			throw new InsuficientBalanceException("Insucient balance!");
		} else {
			balance -= value;
		}
	}

	@Override
	public void makeLoan(String accountNumber, String accountPassword, double value) throws LoanOverTheLimitException, NegativeValueException {
		if(value > loanLimit) {
			throw new LoanOverTheLimitException("Loan above the allowed limit!");
		} else {
			makeDeposit(value);
		}
		
	}

	@Override
	public void makeTransfer(String accountNumber, String accountPassword, LegalAccount destination, double value) throws InsuficientBalanceException, NegativeValueException {
	}

	@Override
	public void makeTransfer(String accountNumber, String accountPassword, PhysicalAccount destination, double value) throws InsuficientBalanceException, NegativeValueException {
		makeWithdraw(value);
		destination.makeDeposit(value);
	}
	
}
