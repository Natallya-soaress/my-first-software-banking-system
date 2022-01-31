package Model.factory;

import java.util.Date;

public class AccountFactory {

	public PhysicalAccount getPhysicalAccount(String number, String accountPassword, float balance, float loanLimit, Date creationDate,
			PhysicalPerson person) {
		
			PhysicalAccount returnn = null;
			returnn = new PhysicalAccount(number, accountPassword, balance, loanLimit, creationDate, person);
			return returnn;
		}
	
	public LegalAccount getLegalAccount(String number, String accountPassword, float balance, float loanLimit, Date creationDate,
			LegalPerson person) {
		
			LegalAccount returnn = null;
			returnn = new LegalAccount(number, accountPassword, balance, loanLimit, creationDate, person);
			return returnn;
		}
}
