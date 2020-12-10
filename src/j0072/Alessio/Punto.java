package j0072.Alessio;

/**
 * creo la classe punto inserendo le eccezioni per paramtri non validi
 * @author ale
 *
 */

public class Punto {
	private int x;
	private int y;
	
	public void setX (int coord_x)  throws PuntoException
	{
		if (coord_x >= -10 && coord_x <= 10) 
		{
		x = coord_x;
		}
		/**
		 * inserisco apposita eccezione
		 */
		
		else {
			throw new PuntoException();
		}
	}
	public int getX ()
	{
		return x;
	}
	
	
	public void setY (int coord_y) throws PuntoException 
	{
		if (coord_y >= -20 && coord_y <= 20) 
		{
			y = coord_y;
		}
		
		else {
			throw new PuntoException();
		}
	}
	
	public int getY()
	
	{
		return y;
	}
	

}
