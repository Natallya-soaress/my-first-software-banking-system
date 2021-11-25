package Model;

import java.util.Date;

public abstract class Person {

	private String name;
	private Date birthDate;
	private Adress adress;
	
	public Person() {
		
	}

	public Person(String name, Date birthDate, Adress adress) {
		this.name = name;
		this.birthDate = birthDate;
		this.adress = adress;
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
