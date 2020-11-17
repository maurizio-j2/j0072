package j0072.Models;

public class ImplementaArray {
	


	public char[] DammiArrayVocali() {
		char[] vocali;
		vocali = new char[5];
		vocali[0] = 'a';
		vocali[1] = 'e';
		vocali[2] = 'i';
		vocali[3] = 'o';
		vocali[4] = 'u';

		/* Sintassi equivalente:
		 * char[] vocali = {'a','e','i','o','u'}; */
		
		return vocali;
	}

	public String[] DammiArrayFiori() {
		String[] fiori;
		fiori = new String[3];
		fiori[0] = "Margherite";
		fiori[1] = "Girasoli";
		fiori[2] = "Gelsomino";
		return fiori;
	}

	public String[] FioriIndiceIndefinito(String stringa_fiori) {
		String[] fiori = stringa_fiori.split(",");
		return fiori;
	}

	public byte[][] DammiCamereAlbergoConOspiti() {
		byte[][] camere = {
			{101, 102, 103, 104},
			{3, 1, 4, 2}
		};
		return camere;
	}
	
	
	public Persona[] DammiArrayPersone() {
		
		/* Definisco un Array di 3 elementi della classe Persona*/
		Persona[] persone = new Persona[3];
		
		Persona persona1 = new Persona();
		
		persona1.nome = "Alessio";
		persona1.cognome = "Valente";
		persona1.anni = 29;
		/* aggiungo l'oggetto persona1 al primo elemento dell'array */
		persone[0] = persona1;

		Persona persona2 = new Persona();
		persona2.nome = "Andrea";
		persona2.cognome = "De Angelis";
		persona2.anni = 29;
		/* aggiungo l'oggetto persona2 al secondo elemento dell'array */
		persone[1] = persona2;
		
		Persona persona3 = new Persona();
		persona3.nome = "Augusto";
		persona3.cognome = "Tilia";
		persona3.anni = 33;
		/* aggiungo l'oggetto persona3 al terzo elemento dell'array */
		persone[2] = persona3;
		
		return persone;
		
	}


}
