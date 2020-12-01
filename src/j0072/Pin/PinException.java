package j0072.Pin;

public class PinException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PinException() {
		super("Eccezione sul Pin");
	}
	
	public String toString() {
		return getMessage() + ": valore errato!";
	}

}
