package Account;

public class SavingsAccount extends Account {

	double amountWithdraw;
	double yieldRate;
	
	public SavingsAccount(String accountNumber, String password, String name, String code, double saldo,
			double withdrawLimit,double amountWithdraw,double yieldRate) {
		
		super(accountNumber, password, name, code, saldo, withdrawLimit);
		this.amountWithdraw = amountWithdraw;
		this.yieldRate = yieldRate;
		
	}

}
