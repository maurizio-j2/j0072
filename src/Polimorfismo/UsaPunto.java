package Polimorfismo;

public class UsaPunto {
	
	public static void main(String[] args) {

		PuntoTridimensionale p3 = new PuntoTridimensionale();
		p3.setX(3.2);
		p3.setY(4.02);
		p3.setZ(5.66);
		double distanzap3 = p3.distanzaDallOrigine();

		PuntoTridimensionale p1 = new PuntoTridimensionale();
		Punto p2 = new Punto();
//		System.out.println(p1);
//		System.out.println(p2);
		
		p1.setZ(1.7);
		//p2.setZ(1.7);
		System.out.println(p1.toString());
		p2.setX(5.3);
		p2.setY(8.0);
		System.out.println(p2.hashCode());
		if (p1.equals(p2)) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Non sono uguali");
				
		}
		

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

//		INVOCAZIONE VIRTUALE DEI METODI
//		Un’ invocazione ad un metodo m (es. distanzaDallOrigine)
//		può definirsi virtuale quando m 
//		è definito in una classe A (es. Punto), 
//		ridefinito in una sottoclasse B (override, esempio PuntoTridimensionale)
//		e invocato su un’istanza di B (es. PuntoTridimensionale),
//		tramite un reference di A (Punto) (polimorfismo per dati).
		Punto p = new PuntoTridimensionale();
		p.setX(7);
		//Chiama virtualmente il metodo toString di Punto 
		// ma eseguie il toString di PuntoTridimensionale 
		System.out.println(p.toString());
		//Chiama virtualmente il metodo distanzaDallOrigine di Punto 
		// ma eseguie il distanzaDallOrigine di PuntoTridimensionale 
		p.distanzaDallOrigine();
//		Quando s’invoca in maniera virtuale il metodo m,
//		il compilatore “pensa” di invocare il metodo m 
//		della classe A (virtualmente).
//		In realtà viene invocato il metodo ridefinito nella classe B.
		
		// Casting di oggetti
		Punto p5 = new PuntoTridimensionale();
		PuntoTridimensionale p4 = (PuntoTridimensionale) p5;
		p4.setZ(2);
	}

}
