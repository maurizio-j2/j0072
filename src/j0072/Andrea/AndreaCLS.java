package j0072.Andrea;

public class AndreaCLS {

	public static void main(String[] args) {
		Aritmetica calcolatrice = new Aritmetica (12);
		
		System.out.println("la variabile byte è: " + calcolatrice.AD_BYTE);
		System.out.println("la variabile short è: " + calcolatrice.AD_SHORT);
		System.out.println("la variabile int è: " + calcolatrice.AD_INT);
		System.out.println("la variabile long è: " + calcolatrice.AD_LONG);
		/* 4 variabili: 
		 * 
		 * nome, cognome, lunghezzanome, lunghezzacognome
		 * 
		 * nome è una stringa. Contiene il nome "andrea"
		 * cognome è una stringa. Contiene il cognome "deangelis".
		 * lunghezzanome (di tipo byte) contiene il numero 
		 * 				di lettere della stringa "nome" andrea = 6
		 * lunghezzacognome (di tipo byte) contiene il numero
		 * 				di lettere della stringa "cognome" deangelis = 9
		
		 *	if: 	è una condizione 
		 *	else: 	è ciò che viene eseguito
		 *    		se non viene verificata la condizione */
		String nome = "andrea";
		String cognome = "deangelis";

		/* nome.length() è di tipo int
		 * per memorizzarlo nel tipo byte devo effettuare il CAST 
		 * lo stesso vale anche per cognome.length() */
		byte lunghezzanome = (byte)nome.length();
		byte lunghezzacognome = (byte)cognome.length();
		
		if (lunghezzanome > lunghezzacognome)
			System.out.print(nome);	
		else
			System.out.print("Il cognome è: " + cognome 
					+ "\red è lungo " + lunghezzacognome + " caratteri.");
	}
}				



