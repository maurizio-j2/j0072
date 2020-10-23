package j0072.Models;

public class Automobile {
	
	// ATTRIBUTI (Varabili d'istanza)
	public int numeroRuote = 4;
	public String  alimentazione;
	public int serrature = 0;
	
	// COSTRUTTORE
	// Il metodo costruttore non c'è!
	// Il compilatore, quindi, aggiungerà quello di default
	// ovvero questo:
	/*
	 * public Automobile(){
	 * }
	 * */
	

	// METODO sbloccaSerrature con Firma1
	public void sbloccaSerrature() {
		// Qui inizia il CORPO DEL METODO
		
		// Questa è una Variabile Locale al metodo
		final int numeroSerrature = 5;
		serrature = numeroSerrature;
		/* Qui scriverò il codice 
		 * che attiva il sensore 
		 * di sblocco serrature */
		
		// Qui finisce il CORPO DEL METODO
	}

	// METODO sbloccaSerrature con Firma2
	/* All'interno delle parentesi troviamo 
	 * i PARAMETRI FORMALI o ARGOMENTI del metodo*/
	public String sbloccaSerrature(int codiceSicurezza) {
		final int numeroSerrature = 5;
		serrature = numeroSerrature;
		/* Qui scriverò il codice 
		 * che attiva il sensore 
		 * di sblocco serrature */
		
		/* A differenza del metodo precedente
		 * che non tornava nulla (void)
		 * questo metodo una stringa
		 * che posso utilizzare
		 * per stamparla a video */ 
		return "Serrature sbloccate tramite codice di sicurezza";
	}

}
