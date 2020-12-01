package j0072.Pin;

public class Pin {

	public short storedPin;
	private byte tentativi;
	
	public Pin () {
		tentativi = 0;
		storedPin = 1234;
	}
	
	public String VerificaPin(short passedPin) throws PinException, PinSecurityException {

		assert passedPin >= 0 && passedPin <= 9999;

		if (passedPin != storedPin) {
			if (tentativi < 3) {
				++tentativi;
				throw new PinException();
			} else {
				throw new PinSecurityException();
			}
		}
		return "Pin valido";
	}

}
