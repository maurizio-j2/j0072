package j0072.Augusto;

import j0072.Models.Aritmetica;

public class Lotto {

	public Ruota[] DammiEstrazione() {
		
		Ruota[] ruote = new Ruota[3];
		String [] nomiRuote = {"Napoli", "Roma", "Milano"};
		
		// eseguo generazio casella
    	for ( byte indiceRuota = 0; indiceRuota < ruote.length; indiceRuota++) {
    		
    		// dichiarazioni
    		Ruota ruota = new Ruota(); 
    		Aritmetica numeriCasuali = new Aritmetica();
  			
    		// valorizzazione oggetti
    		ruota.nomeRuota = nomiRuote[indiceRuota];
    		byte variabileTemp;
    		byte[] numeriRuotaTemp = new byte[5];
    		numeriRuotaTemp[0] = numeriCasuali.GeneraNumeroCasuale((byte)1, (byte)90);
    		
    		for ( byte x = 1; x < numeriRuotaTemp.length; x++) {
    			variabileTemp = numeriCasuali.GeneraNumeroCasuale((byte)1, (byte)90);
    			// variabileTemp = 44
    			// 44 32 52 72
    			for ( byte y = 0; y < x; y++) {
    				if ( numeriRuotaTemp[y] == variabileTemp) {  
    					x--; // ritorno indietro
    				}
    				else {numeriRuotaTemp[x] = variabileTemp; }
    				
    			}
    		}
    		
    		ruota.numero1 = numeriRuotaTemp[0];
    		ruota.numero2 = numeriRuotaTemp[1];
    		ruota.numero3 = numeriRuotaTemp[2];    		
    		ruota.numero4 = numeriRuotaTemp[3];    		
    		ruota.numero5 = numeriRuotaTemp[4];	
    		
    		ruote[indiceRuota] = ruota; 	
    	}

    	for ( byte x = 0; x < ruote.length; x++) {
    		
    		Ruota miaRuota = new Ruota();
    		miaRuota = ruote[x];
//    		byte numeroProva = 42; 
    		
    		System.out.println(
    		miaRuota.nomeRuota + " " 	+ miaRuota.numero1 + " "
    									+ miaRuota.numero2 + " "
    									+ miaRuota.numero3 + " "
    									+ miaRuota.numero4 + " "
										+ miaRuota.numero5 );   		
    		
//    		if ( 	miaRuota.numero1 == numeroProva ||
//    				miaRuota.numero2  == numeroProva ||
//    	    		miaRuota.numero3  == numeroProva ||    				
//    	    	    miaRuota.numero4  == numeroProva ||
//    				miaRuota.numero5 == numeroProva ) {
//    			System.out.println( "trovato nella ruota di " + miaRuota.nomeRuota);
//    			    			
//    		}
    			
    	}
    	return ruote;
	}

		

public static void main(String[] args) {
		
		Lotto ProvaLotto = new Lotto();
		ProvaLotto.DammiEstrazione();
		
	}
	
}