package j0072.Alessio.Gestionale;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Login {

	private String matricola;
	
	public String Getmatricola() {
		return matricola;
	}
	/* Incapsulare l'accesso a matricola (solo Get)*/
	
	public boolean VerificaLogin(String username, String password) throws LoginException, FileNotFoundException  {
		
		URL URLutente = getClass().getResource("Utente.txt");
		File file_utente = new File(URLutente.getPath());
		Scanner lista_utente = new Scanner(file_utente);
		while (lista_utente.hasNextLine()) {
			String[] utente = lista_utente.nextLine().split(",");
			if (utente [1] == username && utente[2] == password) {
			this.matricola = utente[0];
				
			}
		}
		/* Leggo file Utente.txt */
		/* while hasNextLine ...*/
		/*    ...split(",") */
		/* if utente[1] = username E utente[2] = password ... */
		/*     imposto matricola */
		/* chiudo il file */
		
		/* if matricola � nulla oppure la sua lunghezza � zero... */
		/* LoginException */

		return true;
	}

}

