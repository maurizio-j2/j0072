package j0072.Augusto;

public class PuntoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PuntoException() {
		super("Eccezione sulla Coordinata");
	}
	
	public String toString() {
		return getMessage() + ": valore errato!";
	}

}