package j0072;

public class Cicli {

	public static void main(String[] args) {

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		// Equivalente a: 
		i = 1;
		for ( ; i < 10; ) {
			System.out.println(i);
			i++;
		}

		// Equivalente a: 
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i < 10);

		// Equivalente a: 
		int [] arr = {1,2,3,4,5,6,7,8,9};
		for (int k : arr) {
			System.out.println(k);
		}

		// Esempio di Switch Case
		int mese = 4;
		String stagione;
		switch (mese) {
		case 12:
		case 1:
		case 2:
			stagione = "inverno";
			break;
		case 3:
		case 4:
		case 5:
			stagione = "primavera";
			break; //senza questo break si ha estate
		case 6:
		case 7:
		case 8:
			stagione = "estate";
			break;
		case 9:
		case 10:
		case 11:
			stagione = "autunno";
			break;
		default: //la clausola default è opzionale
			stagione = "non identificabile";
		}
		System.out.println("La stagione e' " + stagione);
		
		// Esempio di break e continue
		i = 1;
		procedura1:
		while (true) //ciclo infinito
		{
			if (i == 5) {
				i++;
				continue procedura1;
				}
			
			if (i > 10) break procedura1;
			
			System.out.println(i);
			i++;
		}
		
		// Esempio di Try Catch
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException ex) {
			System.out.println("Errore scatenato da una divisione per zero");
			//System.out.println(ex.getMessage());
		}

	}
}
