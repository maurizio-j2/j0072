package j0072;

public class Operatori {

	public static void main(String[] args) {
		int a, b;
		
		a = 5;
		b = a++; // La variabile a verrà incrementa successivamente all'assegnazione
		System.out.println(a + " " + b);
		
		// NOT Logico (negazione o complemento)
		//a = ~-13; // Nega 1111 1111 1111 1111 1111 1111 1111 0011 = -13
		       // Ottengo 0000 0000 0000 0000 0000 0000 0000 1100 = 12

		// AND logico
		//a = 12 & 3; // 1100 & 0011 ottengo 0000 = 0
		
		// OR Logico
		//a = 12 | 3; // 1100 | 0011 ottengo 1111 = 15
		/* Equivalente a:
		a = 3;
		a |= 12;
		 */		
		
		// XOR Logico
		//a = 12 ^ 10; // 1100 ^ 1010 ottengo 0110 = 6


		// Bit Shift (Operazioni di spostamento di bit)
		//a = -1610612734; // 1010 0000 0000 0000 0000 0000 0000 0010

		 // Shift con assegnazione verso destra di una posizione
		 // mantenendo il segno. Ottengo il valore -805306367
		 //a >>= 1; 			 // 1101 0000 0000 0000 0000 0000 0000 0001

		 // Shift con assegnazione verso destra di una posizione
		 // perdendo l'informazione sul segn. Ottengo il valore 1342177281
		 //a >>>= 1;			 // 0101 0000 0000 0000 0000 0000 0000 0001

		//System.out.println(a);

		// Operatori booleani
//		boolean v, f;
//		f = false;
//		v = !f; // Ma questo v != f; è un errore poichè è operatore di confronto.
//		v &= f;
//		System.out.println(f&v);
		
		// Operatore "Short circuit AND" (AND con corto circuito) 
//		a = 10;
//		b = 1000;
//		boolean controllo = ( (a != 0) && (b/a > 10) );
//		System.out.println(controllo);

	}

}
