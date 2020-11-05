package j0072;

public class Andrea {

	public static void main(String[] args) {
		String nome = "andrea";
		
		int lunghezzanome = nome.length();
		String cognome = "deangelis";
		int lunghezzacognome = cognome.length();
		if (lunghezzanome>lunghezzacognome)
		System.out.print(nome);	
		else
			System.out.print(cognome);
		
	}
}				



/* 4 variabili: nome, cognome, lunghezzanome, lunghezzacognome;
nome è una stringa contenente il nome di giulia.
cognome è una stringa contiene il cognome di de angelis.
lunghezzanome contiene il numero di lettere della stringa "Nome" giulia = 6
lunghezzacognome contiene il numero di lettere della stringa "cognome" de angelis = 9
if: è una condizione 
else: */