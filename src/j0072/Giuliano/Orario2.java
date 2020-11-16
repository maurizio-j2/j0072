package j0072.Giuliano;

public class Orario2 
{

		public static void main(String args[]) {
			// input
			int orario = 37984;
			
			// output
			int ore, minuti, secondi;
			
			// calcolo
			ore = orario / 3600;
			minuti = (orario%3600)/60;
			secondi = orario %60;
			
			// stampa orario
			System.out.println("Orario: " + ore + ":" + minuti + ":" + secondi );

		}

	}
	