package j0072.Giuliano;

public class Aritmetica {
	
		
		// esempio-1
		public static byte a;
		public static short b;
		public static int c;
		public static long d;
		
		public Aritmetica (long Numero) {
			if ( Numero  > -128 &&
					Numero < 127 )  a = (byte) Numero ;
			
				else if ( Numero > -32768 && 
					Numero < 32767) b = (short) Numero;
			
					else if ( Numero > -2147483648 && 
					Numero < 2147483647)   c = (int) Numero;
			
						else if ( Numero > -9223372036854775808L &&
					Numero < +9223372036854775807L) d = Numero;
		}
		
		
		// COSTRUTTORE: assente
		// Verr� usato il costruttore di default
			
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
			 * che user� nel "return" */
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
			 * che user� nel "return" */
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


