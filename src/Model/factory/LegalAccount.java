package Model.factory;

import java.util.Date;

public class LegalAccount {

	private String number;
	private String accountPassword;
	private float balance;
	private float loanLimit;
	private Date creationDate;
	private LegalPerson person;
	
	public LegalAccount(String number, String accountPassword, float balance, float loanLimit, Date creationDate,
			LegalPerson person) {
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

	public LegalPerson getPerson() {
		return person;
	}

	public void setPerson(LegalPerson person) {
		this.person = person;
	}
	
}
