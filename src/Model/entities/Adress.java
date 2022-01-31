package Model.entities;

public class Adress {
	
	private String street;
	private String complement;
	private String number;
	private String district;
	private String city;
	private String country;
	
	public Adress() {
		
	}

	public Adress(String street, String complement, String number, String district, String city, String country) {
		this.street = street;
		this.complement = complement;
		this.number = number;
		this.district = district;
		this.city = city;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
