package Model.entities;

import Model.exceptions.IncorrectPasswordException;

public class Login {

	private String acessNumber;
	private String loginPassword;
	private boolean isInstitution;
	
	public Login() {
		
	}
	
	public Login(String acessNumber, String loginPassword, boolean isInstitution) {
		this.acessNumber = acessNumber;
		this.loginPassword = loginPassword;
		this.isInstitution = isInstitution;
	}

	public String getAcessNumber() {
		return acessNumber;
	}

	public void setAcessNumber(String acessNumber) {
		this.acessNumber = acessNumber;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public boolean isInstitution() {
		return isInstitution;
	}

	public void setInstitution(boolean isInstitution) {
		this.isInstitution = isInstitution;
	}
	
	public void makeLogin(String acessNumber, String loginPassword) throws IncorrectPasswordException {
		if(acessNumber == getAcessNumber() && loginPassword == getLoginPassword()) {
			// Abrir home
		} else {
			throw new IncorrectPasswordException("Incorrect password or username!");
		}
	}
}
