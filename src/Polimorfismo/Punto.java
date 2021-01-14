package Polimorfismo;

public class Punto {
	private double x, y;
	
	public void setX(double x)
	{
		this.x = x;
	}
	public double getX()
	{
		return x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	public double getY()
	{
		return y;
	}
	
	public double distanzaDallOrigine()
	{
		double tmp = Math.pow(x,2.0) + Math.pow(y,2.0);
		return Math.sqrt(tmp);

	}

	//Override del metodo equals().
	// Restituisce true se le variabili d’istanza dei due oggetti coincidono.
		public boolean equals(Object obj) {
			// L’operatore instanceof restituisce true se il primo operando 
			// è un reference che punta ad un oggetto istanziato 
			// dal secondo operando o ad un oggetto istanziato
			// da una sottoclasse del secondo operando.
		    if (!(obj instanceof Punto)) return false;
		    Punto altro = (Punto)obj;
		    return this.x == altro.x && this.y == altro.y;
		}

	//Override del metodo hashCode().
	public int hashCode() {
		return (int)x^(int)this.y;
		}


	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "(x: " + getX() + ", y:" + getY() + ")";
		}
	
	// Eseguo anche un overload dell metodo di cui ho fatto l'Override
	public String toString(boolean descrizione_completa) {
		if (descrizione_completa) {
			return "Coordinate del mio punto: (x: " + getX() + ", y:" + getY() + ")";
			
		} 
		return "(x: " + getX() + ", y:" + getY() + ")";
		}
}
