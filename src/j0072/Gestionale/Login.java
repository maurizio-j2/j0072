package j0072.Gestionale;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Login {

	private String matricola;
	
	public String getMatricola() {
		return matricola;
	}
	
	public boolean VerificaLogin(String username, String password) throws LoginException, FileNotFoundException  {
		URL url = getClass().getResource("Utente.txt");
		File file = new File(url.getPath());
		Scanner lista_utenti = new Scanner(file);
		while (lista_utenti.hasNextLine()) {
			String[] utente = lista_utenti.nextLine().split(",");
			if (utente[1].equals(username) && utente[2].equals(password)){
				matricola = utente[0];
			}
		}			
		lista_utenti.close();
		if ( matricola == null || matricola.length()==0) {
			throw new LoginException();
		}
		return true;
	}

}

