package j0072.Augusto;

public class AugustoCLS {
	
	public static void main(String[] args) {
		Data DataOdierna = new Data(5,11,2020);

		// Stampo la data
		System.out.println("Oggi è il giorno: " + DataOdierna.giorno);
		System.out.println("dell' " + DataOdierna.mese + " esimo mese");
		System.out.println("dell'anno " + DataOdierna.anno);
	}
}
