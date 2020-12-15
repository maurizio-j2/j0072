package j0072.Giuliano.Gestionale;

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

	/* Incapsulare l'accesso a tutte le variabili d'istanza (solo Get) */
	
	// Anagrafica si può "costruire" solo se gli passo una matricola valida
	public Anagrafica(/* matricola */) throws FileNotFoundException {
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
		// di quanto dovrò dimensionare l'array
		// che conterrà le voci di menù.
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
