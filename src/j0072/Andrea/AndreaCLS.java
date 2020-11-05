package j0072.Andrea;

public class AndreaCLS {

	public static void main(String[] args) {
		/* 4 variabili: 
		 * 
		 * nome, cognome, lunghezzanome, lunghezzacognome
		 * 
		 * nome � una stringa. Contiene il nome "andrea"
		 * cognome � una stringa. Contiene il cognome "deangelis".
		 * lunghezzanome (di tipo byte) contiene il numero 
		 * 				di lettere della stringa "nome" andrea = 6
		 * lunghezzacognome (di tipo byte) contiene il numero
		 * 				di lettere della stringa "cognome" deangelis = 9
		
		 *	if: 	� una condizione 
		 *	else: 	� ci� che viene eseguito
		 *    		se non viene verificata la condizione */
		String nome = "andrea";
		String cognome = "deangelis";

		/* nome.length() � di tipo int
		 * per memorizzarlo nel tipo byte devo effettuare il CAST 
		 * lo stesso vale anche per cognome.length() */
		byte lunghezzanome = (byte)nome.length();
		byte lunghezzacognome = (byte)cognome.length();
		
		if (lunghezzanome > lunghezzacognome)
			System.out.print(nome);	
		else
			System.out.print("Il cognome �: " + cognome 
					+ "\red � lungo " + lunghezzacognome + " caratteri.");
	}
}				



