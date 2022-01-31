package Model.exceptions;

public class NegativeValueException extends Exception{

	private static final long serialVersionUID = 1L;

	public NegativeValueException(String message) {
		super(message);
	}
}
