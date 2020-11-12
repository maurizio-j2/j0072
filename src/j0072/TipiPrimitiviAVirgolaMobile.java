package j0072;

public class TipiPrimitiviAVirgolaMobile {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* Tipi primitivi a virgola mobile
		 * 
		 * float  (32 bit)  (da da +/–1.40239846E-45
		 *   					 a +/–3.40282347E-38)
		 * double (64 bit) (da da +/–4.94065645841246544E-324
 		 *  					a +/–1.79769313486231570E-328)
		 */
		
		float f = 1.22F; /* Il cast predefinto è double.
		 				    Senza la F otteniamo un errore. 
		 				    Quindi il cast è obbligatorio. */
		
		f = 0.00314F;
		f = 3.14E-3F;   /* E' il numero 0.00314 
						   scritto in notazione esponenziale*/
		
		double d = 4.33; /* Posso scriverlo omettendo 
		 					o esplicitando il cast */
		d = 4.33D;
		
		/* Il numero qui sotto è scritto con notazioni equivalenti */
		d = 0.000000125;
		d = 0.000000125D;
		d = 1.25E-7;
		d = 1.25E-7D;
		
		/* Alcune operazioni potrebbero dare dei risultati
		 * non compresi nell'insieme dei numeri reali. Ad esempio : */
		d = -1.0/0; /* Il risultato è -Infinity */
		d = 0.0/0; /* Il risultato è NaN (Not a Number) */
	}

}
