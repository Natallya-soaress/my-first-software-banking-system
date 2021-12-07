package Model.exceptions;

public class InsuficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InsuficientBalanceException(String message) {
		super(message);
	}
	
}