package Model.factory;

import java.util.Date;

import Model.entities.Adress;

public class PhysicalPerson extends Person {
	
	private String cpf;
	private boolean isEmployee;
	private String profession;
	private float monthlyIncome;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String controlFlag, String name, Date birthDate, Adress adress, String cpf, boolean isEmployee,
			String profession, float monthlyIncome) {
		super(controlFlag, name, birthDate, adress);
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

	public void setMonthlyIncome(float monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
}
