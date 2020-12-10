package j0072.Giuliano;

public class Punto {
	public static void main (String args[])
	{
	public int x, y;
	Punto p1 = new Punto ();
	Punto p2 = new Punto ();
	p1.x = 5;
	p1.y = 6;
	p2.x = 10;
	p2.y = 20;.
	public class Punto {
		private int x, y;
		private final int VALORE_MASSIMO_PER_X=10 ;
		private final int VALORE_MINIMO_PER_X=-10 ;
		private final int VALORE_MASSIMO_PER_Y=10 ;
		private final int VALORE_MINIMO_PER_Y=-10 ;
		public void setX(int a) {
		if (a <= VALORE_MASSIMO_PER_X && a >=
		VALORE_MINIMO_PER_X){
		x = a;
		System.out.println("X è OK!");
		}
		else {
		System.out.println("X non valida");
		}
		}
		public void setY(int a){
		if (a <= VALORE_MASSIMO_PER_Y && a >=
		VALORE_MINIMO_PER_Y){
		y = a;
		System.out.println("Y è OK!");
		}
		else {
		System.out.println("Y non valida");
		}
		}
		
	}
}
