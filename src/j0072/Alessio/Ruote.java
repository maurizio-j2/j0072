package j0072.Alessio;

public class Ruote {

	public Ruota[] CreaRuote() {
		Ruota[] ruote = new Ruota [3];
		Ruota ruotamilano = new Ruota();
		ruotamilano.nome = "Milano";
		Estrazione estraggo = new Estrazione();
		ruotamilano.primonumero = estraggo.firstnumber (1,90);
		
		ruotamilano.secondonumero = estraggo.firstnumber (1,90);
		
		
	       if (ruotamilano.secondonumero == ruotamilano.primonumero) {
				
				ruotamilano.secondonumero = estraggo.firstnumber(1, 90);
			}
	       
		ruotamilano.terzonumero = estraggo.firstnumber (1,90);
		
		if (ruotamilano.terzonumero == ruotamilano.primonumero 
				  || ruotamilano.terzonumero == ruotamilano.secondonumero) 
			
		{
			ruotamilano.terzonumero = estraggo.firstnumber(1, 90);
			
		}
		
		
		ruotamilano.quartonumero = estraggo.firstnumber (1,90);
		
		
		if (ruotamilano.quartonumero == ruotamilano.terzonumero 
				|| ruotamilano.quartonumero == ruotamilano.secondonumero 
				|| ruotamilano.quartonumero == ruotamilano.primonumero) 
		{
			
			ruotamilano.quartonumero = estraggo.firstnumber(1, 90);
		}
		
		ruotamilano.quintonumero = estraggo.firstnumber (1,90);
		
		if (ruotamilano.quintonumero == ruotamilano.primonumero
				|| ruotamilano.quintonumero == ruotamilano.secondonumero 
				|| ruotamilano.quintonumero == ruotamilano.terzonumero
				|| ruotamilano.quintonumero == ruotamilano.quartonumero)
		{
			ruotamilano.quintonumero= estraggo.firstnumber(1,90);
			
		}
		Integer.toString(ruotamilano.primonumero);
		Integer.toString(ruotamilano.secondonumero);
		Integer.toString(ruotamilano.terzonumero);
		Integer.toString(ruotamilano.quartonumero);
		Integer.toString(ruotamilano.quintonumero);
		
		ruote[0] = ruotamilano;
		
		
		
		Ruota ruotabari = new Ruota();
		ruotabari.nome = "Bari";
		ruotabari.primonumero = estraggo.firstnumber (1,90);
		ruotabari.secondonumero = estraggo.firstnumber (1,90);
		
       if (ruotabari.secondonumero == ruotabari.primonumero) {
			
			ruotabari.secondonumero = estraggo.firstnumber(1, 90);
		}
		
		ruotabari.terzonumero = estraggo.firstnumber (1,90);
		
		if (ruotabari.terzonumero == ruotabari.primonumero 
				  || ruotabari.terzonumero == ruotabari.secondonumero) 
			
		{
			ruotabari.terzonumero = estraggo.firstnumber(1, 90);
		}
		
		ruotabari.quartonumero = estraggo.firstnumber (1,90);
		
		
		if (ruotabari.quartonumero == ruotabari.terzonumero 
				|| ruotabari.quartonumero == ruotabari.secondonumero 
				|| ruotabari.quartonumero == ruotabari.primonumero) {
			
			ruotabari.quartonumero = estraggo.firstnumber(1, 90);
		}
		
		ruotabari.quintonumero = estraggo.firstnumber (1,90);
		
		if (ruotabari.quintonumero == ruotabari.primonumero
				|| ruotabari.quintonumero == ruotabari.secondonumero 
				|| ruotabari.quintonumero == ruotabari.terzonumero
				|| ruotabari.quintonumero == ruotabari.quartonumero)
		{
			ruotabari.quintonumero= estraggo.firstnumber(1,90);
			
		}
		Integer.toString(ruotabari.primonumero);
		Integer.toString(ruotabari.secondonumero);
		Integer.toString(ruotabari.terzonumero);
		Integer.toString(ruotabari.quartonumero);
		Integer.toString(ruotabari.quintonumero);
		ruote [1] = ruotabari;
		
		Ruota ruotaroma = new Ruota ();
		ruotaroma.nome = "Roma";
		ruotaroma.primonumero = estraggo.firstnumber (1,90);
		ruotaroma.secondonumero = estraggo.firstnumber (1,90);
		
		if (ruotaroma.secondonumero == ruotaroma.primonumero) {
			
			ruotaroma.secondonumero = estraggo.firstnumber(1, 90);
		}
		ruotaroma.terzonumero = estraggo.firstnumber (1,90);
		
		if (ruotaroma.terzonumero == ruotaroma.primonumero 
				  || ruotaroma.terzonumero == ruotaroma.secondonumero) 
			
		{
			ruotaroma.terzonumero = estraggo.firstnumber(1, 90);
		}
		
		ruotaroma.quartonumero = estraggo.firstnumber (1,90);
		
		if (ruotaroma.quartonumero == ruotaroma.terzonumero 
				|| ruotaroma.quartonumero == ruotaroma.secondonumero 
				|| ruotaroma.quartonumero == ruotaroma.primonumero) {
			
			ruotaroma.quartonumero = estraggo.firstnumber(1, 90);
		}
		ruotaroma.quintonumero = estraggo.firstnumber (1,90);
		if (ruotaroma.quintonumero == ruotaroma.primonumero
				|| ruotaroma.quintonumero == ruotaroma.secondonumero 
				|| ruotaroma.quintonumero == ruotaroma.terzonumero
				|| ruotaroma.quintonumero == ruotaroma.quartonumero)
		{
			ruotaroma.quintonumero= estraggo.firstnumber(1,90);
			
		}
		ruote [2] = ruotaroma;
		
		Integer.toString(ruotaroma.primonumero);
		Integer.toString(ruotaroma.secondonumero);
		Integer.toString(ruotaroma.terzonumero);
		Integer.toString(ruotaroma.quartonumero);
		Integer.toString(ruotaroma.quintonumero);
		return ruote;

		
	}
	
	
}		