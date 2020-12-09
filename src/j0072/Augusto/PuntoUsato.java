package j0072.Augusto;

public class PuntoUsato {

	public static void main(String[] args) {
		
		Punto NuovoPunto = new Punto();
		
		// prova X
		try {
		NuovoPunto.setX( (byte) 15 );
		NuovoPunto.setY( (byte) 15 );
		System.out.println( NuovoPunto.getX() + ", " + NuovoPunto.getY() ); 

		}
		catch (PuntoException ex1) {
			System.out.println( ex1.toString() );
		} 
			
	}

}
