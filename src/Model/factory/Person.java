package Model.factory;

import java.util.Date;

import Model.entities.Adress;

public abstract class Person {

	private String controlFlag;
	private String name;
	private Date birthDate;
	private Adress adress;
	
	public Person() {
		
	}

	public Person(String controlFlag, String name, Date birthDate, Adress adress) {
		this.controlFlag = controlFlag;
		this.name = name;
		this.birthDate = birthDate;
		this.adress = adress;
	}

	
	public String getControlFlag() {
		return controlFlag;
	}

	public void setControlFlag(String controlFlag) {
		this.controlFlag = controlFlag;
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
