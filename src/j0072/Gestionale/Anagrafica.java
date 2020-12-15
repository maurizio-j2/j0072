package j0072.Gestionale;

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

	public String getMatricola() {
		return matricola;
	}
	public String getCognome() {
		return cognome;
	}
	public String getNome() {
		return nome;
	}
	public String getEta() {
		return eta;
	}
	public String getRuolo() {
		return ruolo;
	}
	public String[] getMenu() {
		return menu;
	}
	
	// Anagrafica si può "costruire" solo se gli passo una matricola valida
	public Anagrafica(String matricola) throws FileNotFoundException {
		URL url = getClass().getResource("Anagrafica.txt");
		File file = new File(url.getPath());
		Scanner lista_anagrafica = new Scanner(file);
		while (lista_anagrafica.hasNextLine()) {
			String[] anagrafica = lista_anagrafica.nextLine().split(",");
			if (anagrafica[0].equals(matricola)){
				this.matricola=anagrafica[0];
				this.cognome=anagrafica[1];
				this.nome=anagrafica[2];
				this.eta=anagrafica[3];
				this.ruolo=anagrafica[4];
			}
		}			
		lista_anagrafica.close();
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
