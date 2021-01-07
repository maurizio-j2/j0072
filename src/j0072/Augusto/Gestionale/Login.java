package j0072.Augusto.Gestionale;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.DefaultRowSorter;

import j0072.Ivanna.Gestionale.LoginException;


public class Login {

	private String matricola;

	/* Incapsulare l'accesso a matricola (solo Get)*/

	public String getMatricola() {
		return matricola;
	}

	public boolean VerificaLogin( String username, String password) throws LoginException, FileNotFoundException  {

		/* Leggo file Utente.txt */
		URL url = getClass().getResource("Utente.txt");
		File file = new File(url.getPath());
		Scanner lista_utenti = new Scanner(file);

		/* while hasNextLine ...*/
		while ( lista_utenti.hasNextLine() ) {
			/*    ...split(",") */
			String[] utente = lista_utenti.nextLine().split(",");
			/* if utente[1] = username E utente[2] = password ... */
			if ( utente[1].equals(username) && utente[2].equals(password) ) {

				/*     imposto matricola */
				this.matricola = utente[0];

			}

			/* chiudo il file */
			lista_utenti.close();

			/* if matricola è nulla oppure la sua lunghezza è zero... */
			if (this.matricola == null || this.matricola.length() == 0 ) {

				/* LoginException */
				throw new LoginException(); 
			}
		}

		return true;
	}

}

