package j0072.Alessio;

public class Ruote {

	public Ruota[] CreaRuote() {
		Ruota[] ruote = new Ruota [3];
		Ruota ruotamilano = new Ruota();
		ruotamilano.nome = "Milano";
		ruotamilano.primonumero = 1;
		ruotamilano.secondonumero = 2;
		ruotamilano.terzonumero = 3;
		ruotamilano.quartonumero = 4;
		ruotamilano.quintonumero = 5;
		ruote[0] = ruotamilano;
		
		Ruota ruotabari = new Ruota();
		ruotabari.nome = "Bari";
		ruotabari.primonumero = 1;
		ruotabari.secondonumero = 2;
		ruotabari.terzonumero = 3;
		ruotabari.quartonumero = 4;
		ruotabari.quintonumero = 5;
		ruote [1] = ruotabari;
		
		Ruota ruotaroma = new Ruota ();
		ruotaroma.nome = "Roma";
		ruotaroma.primonumero = 1;
		ruotaroma.secondonumero = 2;
		ruotaroma.terzonumero = 3;
		ruotaroma.quartonumero = 4;
		ruotaroma.quintonumero = 5;
		ruote [2] = ruotaroma;
		
		return ruote;
	}
		
	
}		