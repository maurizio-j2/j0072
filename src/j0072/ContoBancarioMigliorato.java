package j0072;

public class ContoBancarioMigliorato {
	
	private String codiceIBAN = "IT90X569898769897800";
	private int codiceAccesso = 1234;

	public String getContoBancario(int codiceInserito)
	{
		return controllaCodice(codiceInserito);
	}
	
	// Incapsulamento funzionale
	private String controllaCodice(int codiceInserito) {
		if (codiceInserito == codiceAccesso) {
			return codiceIBAN;
		}
		else {
			return "Errore di accesso al conto bancario!";
		}
	}
}
