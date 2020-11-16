package j0072.Giuliano;

public class Orario2 
{

		public static void main(String args[]) {
			// input
			int orario = 50000;
			
			// output
			int ore, minuti, secondi;
			
			// calcolo
			ore = orario / 3600;
			minuti = (orario%3600)/60;
			secondi = orario %60;
			
			// stampa orario
			System.out.println("Orario: " + ore + ":" + minuti + ":" + secondi );
			
			if ((ore >= 12 ) && (ore <=17))
			{
				System.out.println("Buon Pomeriggio");
			}
			else
			{
				System.out.println ("Buona Giornata");
			}

		}

	}
	