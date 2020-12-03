package j0072.Giuliano;

public class MatriceTrasposta {

	public static void main (String args[])
	
	{
		int matr [ ][ ] = new int [3] [3];
		int trasp [ ][ ] = new int [3] [3];
				
		System.out.println ("Matrice *********************");
		
		for (int riga=0; riga < 3; riga++)
		{
			for (int colonna=0; colonna<3; colonna++)
			{
				matr[riga][colonna] = (int) (Math.random( )*10);
				System.out.print(matr[riga][colonna]+" ");
				
			}
			System.out.println ();
		}
		System.out.println ("\nMatrice trasposta *********");
	
	for (int riga=0; riga < 3; riga++)
	{
		for (int colonna=0; colonna<3; colonna++)
		{
			trasp[riga][colonna] = matr [colonna][riga];
			System.out.print(trasp[riga][colonna]+" ");
		}
		System.out.println ();
	}
	}
}
