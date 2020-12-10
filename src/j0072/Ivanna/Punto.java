package j0072.Ivanna;
//commento

// Definizione di Punto

/* Definisco un modello 
 * per poter rappresentare 
 * il concetto di punto 
 * */
public class Punto {
	private int X;
	private int Y;
		
		public void setX(int numero1) {
			if (numero1 >= -10 && numero1 <= 10) {
			X=numero1;
		}
else {
	System.out.println("Numero " + numero1 +" non è corretto!");
}
		}
	
	
		
			public int getX() {
				return X;
			}
			
		public void setY(int numero2) {
			if (numero2 >= -20 && numero2 <= 20) {
			Y=numero2;
		}
			else {
				System.out.println("Numero " + numero2 +" non è corretto!");
			}
					}
			public int getY() {
				return Y;
			}
}		