package Paghe;

public class Dipendente {
	public String nome;
	public int stipendio;
	public int matricola;
	public String dataDiNascita;
	public String dataDiAssunzione;

	public void determinaPaga(Dipendente dip) {
		
		// L’operatore instanceof restituisce true se il primo operando 
		// è un reference che punta ad un oggetto istanziato 
		// dal secondo operando o ad un oggetto istanziato
		// da una sottoclasse del secondo operando.
		if (dip instanceof Programmatore) {
		//// Casting di oggetti
			Programmatore pro = (Programmatore) dip;
			if (pro.anniDiEsperienza > 3) {
				dip.stipendio = 1500;
			} else {
				dip.stipendio = 1200;
			}
			
		}
		else if (dip instanceof Dirigente){
			dip.stipendio = 3000;
		}
		else if (dip instanceof AgenteDiVendita) {
			dip.stipendio = 1000;
		}
	}


}


