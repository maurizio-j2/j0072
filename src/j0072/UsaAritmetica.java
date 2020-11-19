package j0072;

import j0072.Models.Aritmetica;

public class UsaAritmetica {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// DICHIARO E ISTANZIO
		Aritmetica calcolatrice = new Aritmetica();
		

		// Uso il metodo Moltiplica
		System.out.println("Moltiplico 3 e 2 ");
		System.out.println("Risultato: " + calcolatrice.Moltiplica(3,2));

		// Uso il metodo Somma che sfrutta le VARARGS
		System.out.println("Sommo i numeri 5, 1 e 4 ");
		System.out.println("Risultato: " + calcolatrice.Somma(5,1,4));
		
		Aritmetica oggettoCalc = new Aritmetica(155);
		System.out.println("\rValori delle variabili di classe:");
		System.out.println("BY = " + oggettoCalc.BY);
		System.out.println("SH = "+ oggettoCalc.SH);
		System.out.println("IN = "+ oggettoCalc.IN);
		System.out.println("LO = "+ oggettoCalc.LO);
		
		
		// Genero 128 numeri casuali
		for (byte indice = 0; indice < 127; indice++) {
			System.out.println(
					calcolatrice.GeneraNumeroCasuale((byte)1, (byte)90)
					);
		}
	}

}
