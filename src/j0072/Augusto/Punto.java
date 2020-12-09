package j0072.Augusto;

// Definizione di Punto

/* Definisco un modello 
 * per poter rappresentare 
 * il concetto di punto 
 * */
public class Punto {
	
	private byte x;
	private byte y;
		
	public void setX(byte ascissa) throws PuntoException {
		if ( ascissa >= -10 && ascissa <= 10) {
			x = ascissa;	
		}
		else {
			// System.out.println("La coordinata X indicata è fuori dal range possibile ( -10 +10 ).");
			throw new PuntoException();
		}

	}
	
	public void setY(byte ordinata) throws PuntoException {
		if ( ordinata >= -20 && ordinata <= 20) {
			y = ordinata;
		}
		else {
			// System.out.println("La coordinata Y indicata è fuori dal range possibile ( -20 +20).");
			throw new PuntoException();
		}

	}
	
	public byte getX() {
		return x;
	}
	
	public byte getY() {
		return y;
	}
	
}
