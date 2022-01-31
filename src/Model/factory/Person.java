package Model.factory;

import java.util.Date;

import Model.entities.Adress;

public abstract class Person {

	private String name;
	private Date birthDate;
	private Adress adress;
	private PhysicalAccount physicalAccount;
	private LegalAccount legalAccount;
	
	public Person() {
		
	}

	public Person(String name, Date birthDate, Adress adress, PhysicalAccount physicalAccount) {
		this.name = name;
		this.birthDate = birthDate;
		this.adress = adress;
		this.physicalAccount = physicalAccount;
	}
	
	public Person(String name, Date birthDate, Adress adress, LegalAccount legalAccount) {
		this.name = name;
		this.birthDate = birthDate;
		this.adress = adress;
		this.legalAccount = legalAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	
}
