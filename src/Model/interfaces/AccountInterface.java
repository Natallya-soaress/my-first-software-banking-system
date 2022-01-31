package Model.interfaces;

import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.LoanOverTheLimitException;
import Model.exceptions.NegativeValueException;
import Model.factory.LegalAccount;
import Model.factory.PhysicalAccount;

public interface AccountInterface {
	
	public void makeDeposit(String accountNumber, String accountPassword, double value) throws NegativeValueException;
	
	public void makeDeposit(double value) throws NegativeValueException;
	
	public void makeWithdraw(double value) throws InsuficientBalanceException;
	
	public void makeWithdraw(String accountNumber, String accountPassword, double value) throws InsuficientBalanceException;
	
	public void makeLoan(String accountNumber, String accountPassword, double value) throws LoanOverTheLimitException, NegativeValueException;
	
	public void makeTransfer(String accountNumber, String accountPassword, LegalAccount destination, double value) throws NegativeValueException, InsuficientBalanceException;
	
	public void makeTransfer(String accountNumber, String accountPassword, PhysicalAccount destination, double value) throws InsuficientBalanceException, NegativeValueException;
}
