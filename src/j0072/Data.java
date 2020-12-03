package j0072;

public class Data {
	private int giorno;
	private int mese;
	private int anno;
	
	// Incapsulamento dell'attributo anno
	public void setAnno(int a) {
		anno = a;
	}
	public int getAnno() {
		return anno;
	}
	
	// Incapsulamento dell'attributo mese	
	public void setMese(int m) {
		if (m > 0 && m <= 12) {
			mese = m;
		}
		else {
			System.out.println("Mese non valido");
		}
	}
	public int getMese() {
		return mese;
	}
	
	// Incapsulamento dell'attributo giorno
	public void setGiorno(int g) {
		if (g > 0 && g <= 31) {
			giorno = g;
		}
		else {
			System.out.println("Giorno non valido");
		}
	}
	public int getGiorno() {
		return giorno;
	}
	
}
