package j0072;

public class TipoPrimitivoLetterale {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* Tipo primitivo letterale
		 * char
		 * può avere presenti nell'insieme dei caratteri Unicode
		 * ed è rappresentato nella forma UTF-16 */
		
		char a = '\u0041'; /* A (Alfabeto latino) */
		
		char b = (char)(a + 1); /* Ottengo B come somma di 0041 + 1 */

		/* Caratteri di Escape */
		/* \n return    */
		/* \\ backslash    */
		/* \t Tab    */
		/* \' apice singolo   */
		/* \" doppio apice   */

		char c = '\u23da';  /* Simbolo di messa a terra */
		c = '\u042b'; /* YERU (Alfabeto cirillico) */
		c = '\u6c34'; /* Ideogramma cinese della parola 'acqua' */
		
		/* Mappa dei caratteri dell'alfabeto latino:
		 * https://www.unicode.org/charts/PDF/U0000.pdf
		 * */

	}

}
