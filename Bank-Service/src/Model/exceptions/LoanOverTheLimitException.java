package Model.exceptions;

public class LoanOverTheLimitException extends Exception {

	private static final long serialVersionUID = 1L;

	public LoanOverTheLimitException(String message) {
		super(message);
	}
}