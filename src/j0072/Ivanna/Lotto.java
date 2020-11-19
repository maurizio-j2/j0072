package j0072.Ivanna;

public class Lotto {
	
	public Ruota[] GetCityNumber() {
	Ruota[] ruote = new Ruota[3];
	
		Ruota ruota1 = new Ruota();
		ruota1.nomecittà="Roma";
		ruota1.numero1=10;
		ruota1.numero2=20;
		ruota1.numero3=30;
		ruota1.numero4=40;
		ruota1.numero5=50;
		ruote[0] = ruota1;
		
		Ruota ruota2 = new Ruota();
		ruota2.nomecittà="Firenze";
		ruota2.numero1=1;
		ruota2.numero2=2;
		ruota2.numero3=3;
		ruota2.numero4=4;
		ruota2.numero5=5;
		ruote[1] = ruota2;
	
		Ruota ruota3 = new Ruota();
		ruota3.nomecittà="Napoli";
		ruota3.numero1=11;
		ruota3.numero2=22;
		ruota3.numero3=33;
		ruota3.numero4=44;
		ruota3.numero5=55;
		ruote[2] = ruota3;
	
	return ruote;
	}
}
