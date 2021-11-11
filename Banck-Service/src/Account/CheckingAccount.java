package Account;

public class CheckingAccount extends Account{

	private double loanLimit;
	
	public CheckingAccount(String accountNumber, String password, String name, String code, double saldo,
			double withdrawLimit,double loanLimit) {
		super(accountNumber, password, name, code, saldo, withdrawLimit);
		this.loanLimit = loanLimit;
	}

}
