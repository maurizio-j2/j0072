package j0072.Alessio;
/**
 * creo eccezione PuntoException che utilizzo per valori non validi
 * @author ale
 *
 */

public class PuntoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PuntoException() {
		super("Eccezione sul valore");
	}
	
	public String toString() {
		return getMessage() + ": valore errato!";
	}

}