package j0072;

import j0072.Models.Punto;

public class CreaPunti {

	public static void main(String[] args) {
		
		//Commento su una riga
		
		/* Commento
		 * su diverse
		 * righe
		 */
		
		// Dichiarazione di punto1 
		Punto punto1;
		
		// Istanziazione di punto1
		punto1 = new Punto();
		
		// Assegnazione di un valore a punto1
		punto1.x = 2;
		punto1.y = 6;
		
		// Dichiarazione ed instanziamento di punto2
		Punto punto2 = new Punto();
		
		// Assegnazione di un valore a punto1
		punto2.x = 3;
		punto2.y = 7;

		// Stampa a video di punto1
		System.out.println(punto1.x);
		System.out.println(punto1.y);

		// Stampa a video di punto2
		System.out.println(punto2.x);
		System.out.println(punto2.y);
		

	}

}
