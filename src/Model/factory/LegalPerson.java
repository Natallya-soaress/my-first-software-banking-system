package Model.factory;

import java.util.Date;

import Model.entities.Adress;

public class LegalPerson extends Person {

	private String cnpj;
	private float billingAverage;
	private String instituitionNumber;
	
	public LegalPerson(String controlFlag, String name, Date birthDate, Adress adress, LegalAccount legalAccount, String cnpj2, float billingAverage2, String instituitionNumber2) {
		super();
	}

	public LegalPerson(String name, Date birthDate, Adress adress, LegalAccount legalAccount, String cnpj, float billingAverage,
			String instituitionNumber) {
		super(name, birthDate, adress, legalAccount);
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
