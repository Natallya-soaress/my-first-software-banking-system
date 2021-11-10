package Account;

import Users.*;

public class Account extends Person{

	double withdrawLimit;
	
	public Account(String accountNumber, String password, String name, String code, double saldo,double withdrawLimit) {
		super(accountNumber, password, name, code, saldo);
		this.withdrawLimit = withdrawLimit;
	}
	
}
