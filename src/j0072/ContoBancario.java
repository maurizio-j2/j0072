package j0072;

public class ContoBancario {
	
	// Incapsulamento degli attrubuti
	private String codiceIBAN = "IT90X569898769897800";
	private int codiceAccesso = 1234;
	private int codiceInserito;
	
	public void setCodiceInserito(int cod){
		codiceInserito = cod;
	}

	public String getContoBancario() {
		if (codiceInserito == codiceAccesso) {
			return codiceIBAN;
		}
		else {
			return "Errore di accesso al conto bancario!";
		}
	}

}
