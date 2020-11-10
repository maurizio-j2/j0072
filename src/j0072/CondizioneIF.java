package j0072;

public class CondizioneIF {

	public static void main(String[] args) {
		
		/* Il costrutto condizionale IF...
		 * 
		 * Il costrutto condizionale IF consente Di eseguire 
		 * un set di istruzioni al verificarsi di una condizione.
		 * 
		 * Sintassi:
		 * If (condizione) {
		 * 	istruzioni
		 * }
		 * 
		 * Esempio: 
		 * Dati tre numeri, verifichiamo se sono uguali
		 * */
		
		byte a, b, c = 0;
		 a= 1;
		 b = 2;
		 c = 3;
		 
		 if ( a == b) System.out.println("A è uguale a B");
		 if ( a > b) System.out.println("A è maggiore di B");
		 if ( a >= b) System.out.println("A è maggiore o uguale a B");
		 
		 /* L'operatore logico AND si scrive &&
		  * L'esempio qui sotto si legge così:
		  * Se ('a è uguale b'   E   'b è uguale c') scrivi 'Sono uguali' 
		  * */
		 if ( a == b && b == c) System.out.println("A, B e C sono uguali");
		
		
			/* Il costrutto condizionale IF... ELSE
			 * SE (if) si verifica una certa condizione
			 * esegui un set di istruzioni
			 * ALTRIMENTI (else)
			 * esegui un'altro sei di istruzioni.
			 * Esempio: */
		 if ( a == b ) {
			 System.out.println("A e B sono uguali");
		 } 
		 else {
			 System.out.println("A e B non sono uguali");
		 }
		 
			/* Il costrutto condizionale IF... ELSE IF
			 * SE (if) si verifica una certa condizione
			 * esegui un set di istruzioni
			 * ALTRIMENTI (else)
			 * esegui un'altro sei di istruzioni.
			 * Esempio: */
		 if ( a == b ) {
			 System.out.println("A e B sono uguali");
		 } 
		 else if ( a == c ) {
			 System.out.println("A non è uguale a B, ma è uguale a C");
		 }

	}

}
