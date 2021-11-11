package Users;

public class PhysicalPerson extends Person {
	private String cpf;

	public PhysicalPerson(String accountNumber, String password, String name, String code, double saldo, String cpf) {
		super(accountNumber, password, name, code, saldo);
		this.cpf = cpf;
	}
	
	
	
}
