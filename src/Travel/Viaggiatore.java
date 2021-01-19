package Travel;

public class Viaggiatore {

	//Metodo viaggia con 3 overloads
//	public void viaggia(Automobile a) {
//		a.accelera();
//	}
//	public void viaggia(Aereo a) {
//		a.accelera();
//	}
//	public void viaggia(Nave n) {
//		n.accelera();
//	}

	// I precedenti overloads si possono ridefinire
	// in modo più compatto e funzionale
	// passando al metodo un parametro polimorfo
	// ed invocando il metodo in modo virtuale.
	public void viaggia(Veicolo v) {
		v.accelera();
	}

}
