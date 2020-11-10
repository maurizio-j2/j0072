package j0072.Augusto;

import j0072.Augusto.Aritmetica;

public class AugustoCLS {
	
	public static void main(String[] args) {
		
		
		// 2° ESERCIZIO VERIFICA TIPO DI DATA PRIMITIVO - 10 NOVEMBRE 2020	
		Aritmetica VerificaNumero = new Aritmetica ( 256 );
		
		if 		( VerificaNumero.AT_BYTE != 0)		System.out.println( VerificaNumero.AT_BYTE + " è un numero rappresentato in byte");
		else if ( VerificaNumero.AT_SHORT != 0)		System.out.println( VerificaNumero.AT_SHORT + " è un numero rappresentato in short");
		else if ( VerificaNumero.AT_INT != 0)		System.out.println( VerificaNumero.AT_INT + " è un numero  rappresentato in int");
		else if ( VerificaNumero.AT_LONG != 0)		System.out.println( VerificaNumero.AT_LONG + " è un numero  rappresentato in long");
				
		
		
		// 1° ESERCIZIO SULLA DATA - 29 OTTOBRE 2020
		Data DataOdierna = new Data(5,11,2020);

		// Stampo la data
		System.out.println("Oggi è il giorno: " + DataOdierna.giorno);
		System.out.println("dell' " + DataOdierna.mese + " esimo mese");
		System.out.println("dell'anno " + DataOdierna.anno);
	}
}
