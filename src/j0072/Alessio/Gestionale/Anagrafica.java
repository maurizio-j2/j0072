package j0072.Alessio.Gestionale;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Anagrafica {

	private String matricola;
	private String cognome;
	private String nome;
	private String eta;
	private String ruolo;
	private String[] menu;
	
	public String Getmatricola() {
		return matricola;
	}
	public String Getcognome() {
		return cognome;
	}
	
	public String Getnome() {
		return nome;
	}
	
	public String Geteta() {
		return eta;
	}
	
	public String Getruolo() {
		return ruolo;
	}
	
	public String[] Getmenu() {
		return menu;
	}
	/* Incapsulare l'accesso a tutte le variabili d'istanza (solo Get) */
	
	// Anagrafica si pu� "costruire" solo se gli passo una matricola valida
	public Anagrafica(String matricola) throws FileNotFoundException {
		URL URLanagrafica = getClass().getResource("Anagrafica.txt");
		File file_anagrafica = new File(URLanagrafica.getPath());
		Scanner lista_anagrafica = new Scanner(file_anagrafica);
		while (lista_anagrafica.hasNextLine()) {
			String[] anagrafica = lista_anagrafica.nextLine().split(",");
			if (anagrafica [0].equals(matricola)) {
				this.cognome = anagrafica [1];
				this.nome = anagrafica [2];
				this.eta = anagrafica [3];
				this.ruolo = anagrafica [4];
				this.matricola = anagrafica [0];
				lista_anagrafica.close();
			}
		}
		/* Leggo file Anagrafica.txt */
		/* while hasNextLine ...*/
		/*    ...split(",") */
		/* if anagrafica[0] = matricola ... */
		/*     imposto tutte le variabili di istanza */
		/* chiudo il file */

		/* Invoco il metodo DammiMenu per riempire l'array */
		DammiMenu(this.ruolo);
	}
	
	private void DammiMenu(String ruolo) throws FileNotFoundException {
		URL url = getClass().getResource("Menu.txt");
		File file = new File(url.getPath());
		Scanner lista_menu = new Scanner(file);
		
		// Una prima scansione mi serve per determinare
		// di quanto dovr� dimensionare l'array
		// che conterr� le voci di men�.
		byte i = 0;
		while (lista_menu.hasNextLine()) {
			String[] menu = lista_menu.nextLine().split(",");
			if (menu[0].equals(ruolo)){
				++i;
			}
		}
		
		// Resetto lo Scanner
		lista_menu.close();
		lista_menu = null;
		lista_menu = new Scanner(file);
		
		// Ora posso dimensionare l'array e riempirlo
		this.menu = new String[i];
		byte k = 0;
		while (lista_menu.hasNextLine()) {
			String[] menu = lista_menu.nextLine().split(",");
			if (menu[0].equals(ruolo)){
				this.menu[k] = menu[1];
				++k;
			}
		}	
		lista_menu.close();
	}
	
}
