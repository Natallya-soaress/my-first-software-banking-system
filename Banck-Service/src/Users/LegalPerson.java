package Users;

public class LegalPerson extends Person {
	
	private String cnpj;
	
	public LegalPerson(String accountNumber, String password, String name, String code, double saldo, String cnpj) {
		super(accountNumber, password, name, code, saldo);
		this.cnpj = cnpj;
	}

	
	
}




