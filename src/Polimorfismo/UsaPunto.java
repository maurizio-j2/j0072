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

				
		// Casting di oggetti
//		Punto p3 = new PuntoTridimensionale();
//		PuntoTridimensionale p4 = (PuntoTridimensionale) p3;
//		p4.setZ(2);
	}

}
