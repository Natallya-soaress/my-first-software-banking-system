package Model;

import java.util.Date;

public abstract class Person {

	private String name;
	private Date birthDate;
	private Address address;
	
	public Person() {
		
	}

	public Person(String name, Date birthDate, Address address) {
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
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

	public Address getAdress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}
	
}