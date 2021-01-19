package Travel;

public class UsaTravel {

	public static void main(String[] args) {
		Viaggiatore alessio = new Viaggiatore();
		Automobile maserati = new Automobile();
		alessio.viaggia(maserati);
	
		Viaggiatore augusto = new Viaggiatore();
		Aereo airbus = new Aereo();
		augusto.viaggia(airbus);

		// Il parametro polimorfo con l'invocazione del metodo virtuale
		// è preferibile agli overloads poichè
		// se si dovesse implementare una nuova classe che estende Veicolo
		// as esempio "Bicicletta", non dovremmo
		// aggiungere nulla alla classe Viaggiatore
	}

}
