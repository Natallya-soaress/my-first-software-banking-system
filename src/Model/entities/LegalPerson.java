package Model.entities;

import java.util.Date;

public class LegalPerson extends Person {

	private String cnpj;
	private float billingAverage;
	private String instituitionNumber;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Date birthDate, Adress adress, String cnpj, float billingAverage,
			String instituitionNumber) {
		super(name, birthDate, adress);
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

	public void setBillingAverage(float billingAverage) {
		this.billingAverage = billingAverage;
	}

	public String getInstituitionNumber() {
		return instituitionNumber;
	}

	public void setInstituitionNumber(String instituitionNumber) {
		this.instituitionNumber = instituitionNumber;
	}
	
}
