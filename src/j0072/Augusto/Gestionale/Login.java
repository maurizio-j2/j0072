package j0072.Augusto.Gestionale;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import j0072.Augusto.Gestionale.Utente;

public class Login {

	private String matricola;
	
	public String matricola() {
		return matricola;
	}
	
	public boolean VerificaLogin( String login ) throws LoginException, FileNotFoundException  {
		
		// separo i dati in ingresso al metodo in un array di stringhe
		String[] datiLoginSeparati = login.split(",");
				
		// recupero i dati di accesso dal file utente.txt
		URL url = getClass().getResource("Utente.txt");
		File file = new File(url.getPath());
		Scanner datiAccesso = new Scanner(file);
		
		Utente[] utenti = Utente[2];
		
		// fino a che il file di testo ha linee divido per la virgola
		while (datiAccesso.hasNextLine()) {
			String[] Utenti = datiAccesso.nextLine().split(",");
		}		
		
		if ( datiSingoli[1].equals(datiLoginSeparati[0] && datiSingoli[2].equals(datiLoginSeparati[1] ){
		}
		else {}	

		
		
		/* Leggo file Utente.txt */
		/* while hasNextLine ...*/
		/*    ...split(",") */
		/* if utente[1] = username E utente[2] = password ... */
		/*     imposto matricola */
		/* chiudo il file */
		
		/* if matricola è nulla oppure la sua lunghezza è zero... */
		/* LoginException */

		return true;
	}

}

