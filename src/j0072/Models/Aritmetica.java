package j0072.Models;

public class Aritmetica {
	
	// COSTRUTTORE: assente
	// Verrà usato il costruttore di default
	
	
	
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
