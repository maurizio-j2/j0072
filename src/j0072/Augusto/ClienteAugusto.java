package j0072.Augusto;

import java.util.*;

public class ClienteAugusto {
	
	public static void main(String[] args) {
		
		/* Oggetti del negozio:
		 * Cappello
		 * Maglia
		 * Guanti
		 * Pantaloni
		 * Scarpe
		 */
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String stringa_digitata = input.nextLine();

		int portafoglio = 10; 
		
		// Cappello
		if  (stringa_digitata.equals("Cappello") ) {
			if (portafoglio >= Negozio.Cappello.prezzo ) { 
				portafoglio = portafoglio - Negozio.Cappello.prezzo;
				System.out.println("Ho comprato il cappello");
			}
	
			else System.out.println("Non Ho sufficenti soldi per comprare il cappello");
	
		}
		
		// Maglia
		else if  (stringa_digitata.equals("Maglia") ) {
			if (portafoglio >= Negozio.Maglia.prezzo ) { 
				portafoglio = portafoglio - Negozio.Maglia.prezzo;
				System.out.println("Ho comprato la Maglia");
			}
	
			else System.out.println("Non Ho sufficenti soldi per comprare la Maglia");
	
		}		
		
		// Guanti
		else if  (stringa_digitata.equals("Guanti") ) {
			if (portafoglio >= Negozio.Guanti.prezzo ) { 
				portafoglio = portafoglio - Negozio.Guanti.prezzo;
				System.out.println("Ho comprato i Guanti");
			}
	
			else System.out.println("Non Ho sufficenti soldi per comprare i Guanti");
	
		}		
		
		// Pantaloni
		else if  (stringa_digitata.equals("Pantaloni") ) {
			if (portafoglio >= Negozio.Pantaloni.prezzo ) { 
				portafoglio = portafoglio - Negozio.Pantaloni.prezzo;
				System.out.println("Ho comprato i Pantaloni");
			}
	
			else System.out.println("Non Ho sufficenti soldi per comprare i Pantaloni");
	
		}
		
		// Scarpe
		else if  (stringa_digitata.equals("Scarpe") ) {
			if (portafoglio >= Negozio.Scarpe.prezzo ) { 
				portafoglio = portafoglio - Negozio.Scarpe.prezzo;
				System.out.println("Ho comprato le Scarpe");
			}
	
			else System.out.println("Non Ho sufficenti soldi per comprare le Scarpe");
	
		}
		
		else System.out.println("Prodotto non valido");
		
	}

}