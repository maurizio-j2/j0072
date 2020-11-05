package j0072;

import j0072.Models.Automobile;

public class UsaAutomobile {

	public static void main(String[] args) {
		
		// Creo e uso un'oggetto "Panda"...
		// DICHIARO E ISTANZIO
		Automobile panda = new Automobile();
		// VALORIZZO LE VARIABILE DI ISTANZA
		panda.alimentazione = "Benzina";
		panda.NUMERO_SERRATURE = 2;
		// INVOCO IL METODO sbloccaSerrature()
		panda.sbloccaSerrature();
		
		// Stampo "a video" la Panda
		System.out.println("************");
		System.out.println("Panda creata.");
		System.out.println("La Panda ha numero " + Automobile.NUMERO_RUOTE + " ruote.");
		System.out.println("La Panda è alimentata a " + panda.alimentazione + ".");
		System.out.println("La Panda ha numero " + panda.NUMERO_SERRATURE + " serrature.");
		System.out.println("La Panda ha le serrature sbloccate.");
		System.out.println("************");

		
		// Creo e uso un'oggetto "Fiat500"...
		Automobile fiat500 = new Automobile();
		fiat500.alimentazione = "Diesel";
		fiat500.NUMERO_SERRATURE = 5;
		/* Qui manca lo sbloccoSerrature con codice.
		 * Lo invocherò quando farò la stampa a video
		 * poichè esso mi restituisce una stringa */
		
		// Stampo "a video" la Fiat500
		System.out.println("************");
		System.out.println("Fiat500 creata.");
		System.out.println("La Fiat500 ha numero " + Automobile.NUMERO_RUOTE + " ruote.");
		System.out.println("La Fiat500 è alimentata a " + fiat500.alimentazione + ".");
		System.out.println("La Fiat500 ha numero " + fiat500.NUMERO_SERRATURE + " serrature.");
		/* INVOCO IL METODO sbloccaSerrature
		 * il quale ha una seconda firma 
		 * che richiede un PARAMETRO FORMALE (o ARGOMENTO).
		 * Gli passerò il valore 1234*/
		System.out.println(fiat500.sbloccaSerrature(1234));
		System.out.println("************");


	}

}
