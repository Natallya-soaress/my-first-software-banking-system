package Users;

public class Person {
	//Atributos da super classe Person
	//Super class attributes 
	private String accountNumber;
	private String password;
	private String name;
	private String code; //CPF/CPNJ
	private double saldo;
	
	
	//Método Construtor
	//Constructor Method
	public Person(String accountNumber, String password, String name, String code, double saldo) {
		super();
		this.accountNumber = accountNumber;
		this.password = password;
		this.name = name;
		this.code = code; //CPF/CNPJ
		this.saldo = saldo;
	}
	

	
	
}
