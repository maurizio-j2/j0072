package j0072;

import j0072.Models.Aritmetica;

public class UsaAritmetica {

	public static void main(String[] args) {
		// DICHIARO E ISTANZIO
		Aritmetica calcolatrice = new Aritmetica();
		
		// Uso il metodo Moltiplica
		System.out.println("Moltiplico 3 e 2 ");
		System.out.println("Risultato: " + calcolatrice.Moltiplica(3,2));

		// Uso il metodo Somma che sfrutta le VARARGS
		System.out.println("Sommo i numeri 5, 1 e 4 ");
		System.out.println("Risultato: " + calcolatrice.Somma(5,1,4));

	}

}
