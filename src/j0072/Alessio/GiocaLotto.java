package j0072.Alessio;
import java.util.*;

public class GiocaLotto {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
			Ruote mie_ruote = new Ruote();
		
			System.out.println("Ecco la lista delle ruote e dei rispettivi numeri");
			Ruota[]lista_ruote = mie_ruote.CreaRuote();
			for (Ruota singola_ruota : lista_ruote) {
			System.out.println(singola_ruota.nome + " " 
		            + singola_ruota.primonumero + " " 
					+ singola_ruota.secondonumero + " " 
					+ singola_ruota.terzonumero + " "
					+ singola_ruota.quartonumero + " "
					+ singola_ruota.quintonumero);
			}
	
			System.out.println("Digita un numero da 1 a 5");
			Scanner input = new Scanner(System.in);
			String numero_scelto = input.nextLine();
			System.out.println ("Digita ora la ruota che vuoi giocare");
			Scanner input2 = new Scanner(System.in);
			String ruota_scelta = input2.nextLine();
		    
			Ruota ruotamilano = new Ruota();
		    String nomemilano = ruotamilano.nome;
		    Ruota ruotabari = new Ruota ();
		    String nomebari = ruotabari.nome;
		    Ruota ruotaroma = new Ruota ();
		    String nomeroma = ruotaroma.nome;
		    
		    
			int numero_intero = Integer. parseInt(numero_scelto);
		
			Estrazione numeroestratto = new Estrazione();
			
		
			
			if (ruota_scelta.equals("Milano"))
			{
				final int mionumeromilano = numeroestratto.MiaEstrazione(1,5);
				System.out.println("Milano estrae4 il numero " + mionumeromilano);
				if (numero_intero == mionumeromilano) {
					System.out.println("Bravo, hai vinto!");
				}
				else  {
					System.out.println("Peccato, hai perso!");
				}
				
			}
			else if (ruota_scelta.equals("Bari"))
			{
				final int mionumerobari = numeroestratto.MiaEstrazione(1, 5);
				System.out.println("Bari estrae il numero " + mionumerobari);
				if (numero_intero == mionumerobari) {
					System.out.println("Bravo, hai vinto!");
				}
				
				else  {
					System.out.println("Peccato, hai perso!");
			}
			}
			
			else if (ruota_scelta.equals("Roma"))
			{
				final int mionumeroroma = numeroestratto.MiaEstrazione(1, 5);
				System.out.println("Roma estrae il numero " + mionumeroroma);
				
				if (numero_intero == mionumeroroma) {
					System.out.println("Bravo, hai vinto!");
				}
				
				else  {
					System.out.println("Peccato, hai perso!");
			}

			}
			
			
			
	
	} 
	
}	
