package j0072.Augusto;

public class Aritmetica {

	public static byte AT_BYTE ;
	public static short AT_SHORT;
	public static int AT_INT;
	public static long AT_LONG;
	
	
	//metodo costruttore
		public Aritmetica (long Numero) {
				if ( Numero >= -128
				  && Numero <= 127) AT_BYTE = (byte) Numero;
				
				else if ( Numero >= -32768
					   && Numero <= 32767) AT_SHORT = (short) Numero;
					
				else if ( Numero >= -2147483648
					   && Numero <= 2147483647)	AT_INT = (int) Numero;
					
				else if ( Numero >= -9223372036854775808L
					   && Numero <= 9223372036854775807L)AT_LONG = Numero;
					
		}
		
		/*metodo costruttore vuoto
		// Serve a utilizzare anche un costruttore vuoto se dovesse mancare il parametro
		 */
		public Aritmetica () {
		
		}
			
	// METODO Moltiplica
	// Questo metodo moltiplica due numeri interi
	public int Moltiplica(int valore1, int valore2) {
		return valore1 * valore2;
	}

	
	
	// METODO Somma
	/* Questo metodo somma
	 * un insieme NON DEFINITO di numeri interi
	 * utilizzando le VARARGS
	 * che si implementano usando i 3 puntini
	*/	
	public int Somma(int... i_miei_numeri) {
		/* Imposto una variabile locale al metodo 
		 * che userò nel "return" */
		int risultato = 0;
		
		/* Eseguo un ciclo for(){} all'interno di "i_miei_numeri" 
		 * che contiene tutti i valori della mia collezione
		 */
		for (int singolo_numero : i_miei_numeri) {
			risultato += singolo_numero;
		}
		
		return risultato;
	}

	public int Somma(String stringa_di_numeri) {
		/* Imposto una variabile locale al metodo 
		 * che userò nel "return" */
		int risultato = 0;
		
		String[] vettore = stringa_di_numeri.split(",");
		/* Eseguo un ciclo for(){} all'interno di "i_miei_numeri" 
		 * che contiene tutti i valori della mia collezione
		 */		
		for (String singolo_numero : vettore) {
			risultato += Integer.parseInt(singolo_numero);
		}
		
		return risultato;
	}

}
