package j0072;

public class TipiPrimitiviInteri {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* Tipi primitivi interi
		 * 
		 * byte  (8 bit)  (da -128 a +127)
		 * short (16 bit) (da -32.768 a +32.767)
		 * int 	 (32 bit) (da -2.147.483.648
		 * 				    a +2.147.483.647)
		 * long  (64 bit) (da -9.223.372.036.854.775.808
		 * 					 a 9.223.372.036.854.775.807)
		 */
		
		byte anni = 29; /* Notazione decimale */
		anni = 035; 	/* Notazione ottale */
		anni = 0x1D; 	/* Notazione esadecimale */
		
		short contaPassi = 30000;
		
		/* Premio Lotteria: 2 miliardi */
		int montepremiLotteria = 2000000000;
		
		/* Distanza Terra-Sole: 149 milioni di km */
		long unitaAstronomica = 149597870700L;
		
		/* Se eseguo questa istruzione:
		 * anni = anni + 1
		 * per la regola delle PROMOTION.
		 * La variabile anni viene promossa da byte a int
		 * quindi otterrò un errore se scrivo anni = anni + 1 .
		 * Per riportarla a byte devo eseguire il CAST,
		 * questo perchè il compilatore vuole che noi siamo
		 * coscienti quando perdiamo precisione nel numero. */
		anni = (byte)(anni + 1);
		
		/* Errori di compilazione: 
		byte b = 128; (il massimo per short è 127)
		short s = 32768; (il massimo per short è 32767)
		int i = 2147483648; (il massimo per int è 2147483647) */
		
		/* Errori di valutazione:
		 * int i = 128;
		 * byte b = (byte)i; Attenzione: in b avrò -128!*/
		
		/* Lo stesso errore avrò in quest'altro caso:
		 * int a = 2147483647; Massimo valore per un int
		   int b = 1;
		   int risultato = a+b; Ottengo -2147483648!
		 */
		
		/* Altro tipo di errore è questo:
		 * long l = 3000000000; 
		 * Questo produce un errore poichè il numero 3 miliardi,
		 * essendo un int, supera il massimo valore ammesso per un int.
		 * Quindi devo mettere la L per dire al compilatore
		 * che lo deve memorizzare come un long.
		 * L'istruzione corretta è:
		 * long l = 3000000000L; 
		 */
	}

}
