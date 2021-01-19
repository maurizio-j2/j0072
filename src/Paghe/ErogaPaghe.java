package Paghe;

public class ErogaPaghe {

	public static void main(String[] args) {
		
		//Collezione eterogenea di Dipendenti
		Dipendente[] arr = new Dipendente[3];
		arr[0] = new Dirigente();
		arr[1] = new Programmatore();
		arr[2] = new AgenteDiVendita();

		for (Dipendente dipendente : arr) {
			dipendente.determinaPaga(dipendente);
			System.out.println(dipendente.stipendio);
		}	
	}

}
