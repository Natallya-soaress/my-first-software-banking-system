package Model.interfaces;

import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.LoanOverTheLimitException;
import Model.exceptions.NegativeDepositException;
import Model.factory.LegalAccount;
import Model.factory.PhysicalAccount;

public interface AccountInterface {
	
	public void makeDeposit(String accountNumber, String accountPassword, double value) throws NegativeDepositException;
	
	public void makeDeposit(double value) throws NegativeDepositException;
	
	public void makeWithdraw(double value) throws InsuficientBalanceException;
	
	public void makeWithdraw(String accountNumber, String accountPassword, double value) throws InsuficientBalanceException;
	
	public void makeLoan(String accountNumber, String accountPassword, double value) throws LoanOverTheLimitException, NegativeDepositException;
	
	public void makeTransfer(String accountNumber, String accountPassword, LegalAccount destination, double value) throws NegativeDepositException, InsuficientBalanceException;
	
	public void makeTransfer(String accountNumber, String accountPassword, PhysicalAccount destination, double value) throws InsuficientBalanceException, NegativeDepositException;
}
