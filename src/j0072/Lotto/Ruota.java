/**
 * Package che implementa l'applicazione Lotto
 */
package j0072.Lotto;

/** Classe che definisce il modello Ruota
 * @author Maurizio
 *
 */
public class Ruota {
	/** Definisce il nome della ruota*/
	public String citta;
	/** Definisce l'array dei numeri */
	public byte[] numero;
	
	/** Affinchè la classe <i><b>Ruota</b></i> possa essere costruita 
	 * correttamente implemento un costruttore che richiede
	 * un parametro String che valorizza la variabile di classe
	 * <i><b>citta</b></i> e, nello stesso tempo, fissa il numero di elementi 
	 * dell'array <i><b>numeri</b></i> a 5. */
	public Ruota(String ruota_di) {
		citta = ruota_di;
		numero = new byte[5];
	}
}
