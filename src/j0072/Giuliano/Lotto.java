package j0072.Giuliano;

public class Lotto {
	
	
	public Ruota[] ruote;
	
	public Lotto() {
		Ruota mi = new Ruota("Milano");
		Ruota rm = new Ruota("Roma");
		Ruota pa = new Ruota("Palermo");
		
		Ruota[] arrayRuota = new Ruota[3];
		arrayRuota[0] = mi;
		arrayRuota[1] = rm;
		arrayRuota[2] = pa;
		
		ruote = arrayRuota;

	}
	
	public void StampaRuote() {
		for (Ruota ruota : ruote) {
			System.out.print(ruota.citta + " ");
			for (byte i = 0; i < ruota.numero.length; i++) {
				System.out.print(ruota.numero[i] + " ");
			}
			System.out.print("\r");
		}
	}
	
	public byte GeneraNumeroCasuale(byte estremo1, byte estremo2) {
		byte numerocasuale = (byte) ((Math.random() * estremo2) + estremo1);
		return numerocasuale;
	}
	
	public void Estrai() {
		/*Per tutte le ruote: */
		for (Ruota ruota : ruote) {
			
			/* Per tutta la lunghezza dell'array di numeri della singola ruota */
			for (byte i = 0; i < ruota.numero.length; i++) {
				
				/* Estraggo un numero casuale tra 1 e 90*/
				byte num_estratto = this.GeneraNumeroCasuale((byte)1, (byte)90);

				if (i == 0) {ruota.numero[i] = num_estratto;}
				
				/* Scorro tutta la ruota con l'indice k.
				 * Se trovo un numero uguale al numero estratto
				 * torno indietro con l'indice i
				 * per poter estrarre un nuovo numero.
				 * Altrimenti, inserisco il numero.*/
				for (byte k = 0; k < i; k++) {
					if (ruota.numero[k] == num_estratto ) {
						i--;
					}
					else {
						ruota.numero[i] = num_estratto;
					}
					
				}
				
			}
		}
		
	}
}
