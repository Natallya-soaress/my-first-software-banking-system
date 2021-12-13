package Model.entities;

public class Login {

	private int accessNumber;
	private int loginPassword;
	private boolean isInstitution;
	
	public Login() {
		
	}
	
	public Login(int accessNumber, int loginPassword, boolean isInstitution) {
		this.accessNumber = accessNumber;
		this.loginPassword = loginPassword;
		this.isInstitution = isInstitution;
	}

	public int getAcessNumber() {
		return accessNumber;
	}

	public void setAcessNumber(int acessNumber) {
		this.accessNumber = acessNumber;
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