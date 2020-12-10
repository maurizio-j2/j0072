package j0072.Ivanna;

public class Estrazione {
	

	public byte GeneraNumeroCasuale(byte estremo1, byte estremo2) {
		byte numerocasuale = (byte) ((Math.random() * estremo2) + estremo1);
		return numerocasuale;
	}
}
