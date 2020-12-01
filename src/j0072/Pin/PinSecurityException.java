package j0072.Pin;

public class PinSecurityException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PinSecurityException() {
		super("Eccezione di Sicurezza Pin");
	}
	
	public String toString() {
		return getMessage() + ": tentativi esauriti!";
	}

}
