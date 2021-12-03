package Model;

public class Address {
	
	private String street;
	private String complement;
	private int number;
	private String district;
	private String city;
	private String country;
	
	public Address() {
		
	}

	public Address(String street, String complement, int number, String district, String city, String country) {
		
		try {
			
			if(number < 0) {
				throw new Exception("Não pode ser número negativo");
			}
			this.street = street;
			this.complement = complement;
			this.number = number;
			this.district = district;
			this.city = city;
			this.country = country;
			
		}catch(Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		try {
			
			if(number < 0) {
				throw new Exception("Não pode ser número negativo");
			}
			this.number = number;
		}catch(Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}
			
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
