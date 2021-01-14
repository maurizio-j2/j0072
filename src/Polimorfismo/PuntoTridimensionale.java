package Polimorfismo;

public class PuntoTridimensionale extends Punto
{
	private double z;
	public void setZ(double z)
	{
		this.z = z;
	}
	public double getZ(double z)
	{
		return z;
	}
	public double distanzaDallOrigine()
	{
		double tmp = Math.pow(getX(),2.0) + Math.pow(getY(),2.0) + Math.pow(z, 2.0); 
		// Nota: le variabili interne alla classe Punto (x e y)
		// non sono state ereditate. Sono state utilizzate le rispettive proprietà
		// che le incapsulano.
		return Math.sqrt(tmp);
	}

	@Override
	public boolean equals(Object obj) {
	    if (!(obj instanceof PuntoTridimensionale)) return false;
	    PuntoTridimensionale altro = (PuntoTridimensionale)obj;
	    return this.getX() == altro.getX() &&
	    	   this.getY() == altro.getY() &&
	    	   this.z == altro.z;
	}
	public String toString() {
		return "(x:" + getX() + ", y:" + getY() + ", z:" + this.z + ")";
	}
	
	
}
