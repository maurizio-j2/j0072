package j0072.Giuliano;
public class Punto {
	private byte x;
			
			public void setX(byte coordx)  {
				{
			}
			if (coordx>= -10 && coordx <= 10) {
			x = coordx;
			}
			else {
			System.out.println("Out of range");
			}
			}
		public byte getX() {
			return x;
	}
}
