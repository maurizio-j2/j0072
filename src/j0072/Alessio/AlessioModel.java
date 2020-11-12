package j0072.Alessio;

public class AlessioModel {

	/* Non uso il modificatore static
	   perche' tutti gli oggetti istanziati
	   riporterebbero il medesimo valore di anni. 

	   Inoltre, posso usare il tipo byte perche' puo'
	   contenere l'eta' di un essere umano*/
	public byte anni;

	
	public static String nome = "Alessio";
	public static String cognome = "Valente";
	public static int namelenght = nome.length();
	public static int surnamelenght = cognome.length();

}
