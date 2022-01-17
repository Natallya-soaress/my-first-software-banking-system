package Model.entities;

import java.util.Date;

public class LegalPerson extends Person {

	private String cnpj;
	private double billingAverage; //Média de faturamento
	private int instituitionNumber;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Date birthDate, Address address, String cnpj, double billingAverage, int instituitionNumber) {
		super(name, birthDate, address);
		this.cnpj = cnpj;
		this.billingAverage = billingAverage;
		this.instituitionNumber = instituitionNumber;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getBillingAverage() {
		return billingAverage;
	}

	public void setBillingAverage(double billingAverage) {
		this.billingAverage = billingAverage;
	}

	public int getInstituitionNumber() {
		return instituitionNumber;
	}

	public void setInstituitionNumber(int instituitionNumber) {
		this.instituitionNumber = instituitionNumber;
	}
	
}