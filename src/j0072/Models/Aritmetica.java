package j0072.Models;

public class Aritmetica {
	
	/* *** Esercizio del 10/11/2020 *** */
	public static byte BY;
	public static short SH;
	public static int IN;
	public static long LO;
	
	/* Costruttore */
	public Aritmetica(long number) {
		if (   number >= -128 
			&& number <= 127) BY = (byte) number;
		
		else if (   number >= -32768
				 && number <= 32767) SH = (short) number;
		
		else if (   number >= -2147483648
				 && number <= 2147483647) IN = (int) number;
		
		else if (   number >= -9223372036854775808L 
				 && number <= 9223372036854775807L) LO = number;
	}
	/* I numeri presenti all'interno dei vari if 
	 * vengono rappresentati dal compilarore come int */
	/* *** fine Esercizio 1 *** */

	/* Dichiaro anche il costruttore vuoto affinche'
	 * questa classe possa funzionare 
	 * anche con gli esempi precedenti*/
	public Aritmetica() {
		
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
