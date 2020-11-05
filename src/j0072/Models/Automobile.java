package j0072.Models;

public class Automobile {
	
	// ATTRIBUTI (Varabili d'istanza)
	public static final byte NUMERO_RUOTE = 4;
	public byte NUMERO_SERRATURE = 5;
	public String  alimentazione;
	
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
		
		/* Scriverò il codice 
		 * che attiva il sensore 
		 * di sblocco serrature */
		
		// Qui finisce il CORPO DEL METODO
	}

	
	
	// METODO sbloccaSerrature con Firma2
	/* All'interno delle parentesi troviamo 
	 * i PARAMETRI FORMALI o ARGOMENTI del metodo*/

	public String sbloccaSerrature(int codiceSicurezza) {
		/* A differenza del metodo precedente
		 * che non tornava nulla (void)
		 * questo metodo una stringa
		 * che posso utilizzare
		 * per stamparla a video */ 
		return "Serrature sbloccate tramite codice di sicurezza.";
	}

}
