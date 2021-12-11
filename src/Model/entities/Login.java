package Model.entities;

public class Login {

	private int acessNumber;
	private int loginPassword;
	private boolean isInstitution;
	
	public Login() {
		
	}
	
	public Login(int acessNumber, int loginPassword, boolean isInstitution) {
		this.acessNumber = acessNumber;
		this.loginPassword = loginPassword;
		this.isInstitution = isInstitution;
	}

	public int getAcessNumber() {
		return acessNumber;
	}

	public void setAcessNumber(int acessNumber) {
		this.acessNumber = acessNumber;
	}

	public int getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(int loginPassword) {
		this.loginPassword = loginPassword;
	}

	public boolean isInstitution() {
		return isInstitution;
	}

	public void setInstitution(boolean isInstitution) {
		this.isInstitution = isInstitution;
	}
	
	public void makeLogin() {
		
	}
	
	public void createAccount() {
		
	}
}
