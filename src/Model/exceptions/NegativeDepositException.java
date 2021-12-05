package Model.exceptions;

public class NegativeDepositException extends Exception{

	private static final long serialVersionUID = 1L;

	public NegativeDepositException(String message) {
		super(message);
	}
}
