package j0072;

import j0072.Models.Persona;
import j0072.Models.ImplementaArray;

public class UsaArray {

	public static void main(String[] args) {
		
		/* Istanzio la classe ImplementaArray
		 * che mi servirà per diversi Array
		 */
		ImplementaArray mia_classearray = new ImplementaArray();

		/* Ora, posso invocare il metodo 'DammiArrayVocali'
		 * e riempio 'mie_vocali' che è un array di char*/
		char[] mie_vocali = mia_classearray.DammiArrayVocali();
		for (byte indice = 0; indice < mie_vocali.length; indice++) {
			System.out.println(mie_vocali[indice]);
		}

		System.out.println("");

		/* E posso invocare il metodo 'DammiArrayFiori'
		 * e riempio 'miei_fiori' che è un array di String*/
		String[] miei_fiori = mia_classearray.DammiArrayFiori();
		
		/* Posso fare un ciclo for 
		 * per stampare tutti i valori
		 * all'interno dell'array*/
		for (byte indice = 0; indice < miei_fiori.length; indice++) {
			System.out.println(miei_fiori[indice]);
		}

		System.out.println("");
		
		/* Ma, il precedente ciclo for lo posso scrivere
		 * anche in quest'altro modo.
		 * Che si legge così:
		 * 
		 * "Per tutti i 'singolo_fiore' 
		 * all'interno della collezione 'miei_fiori' "*/
		for (String singolo_fiore : miei_fiori) {
			System.out.println(singolo_fiore);
			
		};

		System.out.println("");
		
		/* Il metodo split conta gli elementi splittati 
		 * e crea un array. Lo posso utilizzare 
		 * se non conosco, a priori, il numero di elementi
		 * del mio array. */
		String[] fiori_indefiniti = mia_classearray.FioriIndiceIndefinito("Rosa,Gerbera,Peonia,Violetta");
		for (String singolo_fiore : fiori_indefiniti) {
			System.out.println(singolo_fiore);
			
		};

		System.out.println("");
		
		/* Array bidimensionale */
		byte[][] camere_con_ospiti = mia_classearray.DammiCamereAlbergoConOspiti();
        for (byte x = 0; x < camere_con_ospiti[0].length; ++x) {
                System.out.println(camere_con_ospiti[0][x] 
                		   + " " + camere_con_ospiti[1][x] );
        }
        
        
		System.out.println("\r*** Array della classe Persona ***");
		Persona[] mie_persone = mia_classearray.DammiArrayPersone();
		for (Persona singola_persona : mie_persone) {
			System.out.println(singola_persona.cognome + 
						 " " + singola_persona.nome + " " 
						 	 + singola_persona.anni );
			
		};
		System.out.println("*** Fine Array  classe Persona ***");
		
	}

}
