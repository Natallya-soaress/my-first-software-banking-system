package Model;

import java.util.Date;

public class PhysicalPerson extends Person {
	
	private String cpf;
	private boolean isEmployee;
	private String profession;
	private double monthlyIncome;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Date birthDate, Address address, String cpf, boolean isEmployee, String profession,
			double monthlyIncome) {
		super(name, birthDate, address);
		this.cpf = cpf;
		this.isEmployee = isEmployee;
		this.profession = profession;
		this.monthlyIncome = monthlyIncome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isEmployee() {
		return isEmployee;
	}

	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
}