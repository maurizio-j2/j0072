package j0072.Alessio;

/* Non uso la clausola import
 * poiche' la classe AlessioCLS
   fa parte dello stesso package */

public class AlessioMain {

	public  static void main(String[] args) {

		AlessioModel alessio = new AlessioModel ();
		alessio.anni = 29;
		System.out.println ("La mia età è: " + alessio.anni + " anni");

		// Assegno il tipo primitivo adatto al numero dei miei anni
		// Il risultato viene stampato direttamente dalla classe CalcolaAlessio

		CalcolaAlessio prova = new CalcolaAlessio (alessio.anni);

		System.out.println ("Vorrei vivere più anni \nProviamo a moltiplicare i miei anni per i caratteri del mio nome");

		// trasformo i caratteri che possiede la stringa nome e cognome in una variabile numerica

		long caratterinome = AlessioModel.namelenght ;
		long carattericognome = AlessioModel.surnamelenght ;
		System.out.println("Conto i caratteri totali");

		SuperAnni addlife = new SuperAnni (caratterinome , carattericognome);

		// Sommo il numero dei caratteri di nome e cognome

		long totalechar = addlife.Somma(caratterinome, carattericognome);
		System.out.println ("I caratteri totali sono " + totalechar );

		// Moltiplico il numero dei miei anni al numero dei caratteri di nome e cognome

		long nuovianni = addlife.Moltiplica(totalechar, alessio.anni);

		System.out.println ("Ora moltiplico gli anni ai caratteri \nIl risultato vale " + nuovianni);
		System.out.println ("Vediamo ora che tipo di variabile è la mia età");

		// Assegno il tipo primitivo adatto alla nuova variabile 

		CalcolaAlessio prova2 = new CalcolaAlessio (nuovianni);
		System.out.println ("Posso dirmi soddisfatto di vivere tanto a lungo :D");
	}
}

