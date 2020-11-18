package j0072.Augusto;

public class Lotto {


	public void DammiEstrazione () {
		
		String[][] ruote =	{
				{"Napoli", "3", "26", "45", "84", "90"},
				{"Roma", "1", "12", "27", "54", "66"},
				{"Milano", "5", "41", "55", "57", "78"}
		};
		
        for ( byte indiceRuota = 0; indiceRuota < ruote.length; indiceRuota++) {
            for ( byte indiceEstrazione = 0; indiceEstrazione < ruote[indiceRuota].length; indiceEstrazione++ ) {
            	System.out.print(ruote[indiceRuota][indiceEstrazione] + " ") ;
            }
            
            System.out.println();
        }
			
	}
	
	public static void main(String[] args) {
		
		Lotto ProvaLotto = new Lotto();
		ProvaLotto.DammiEstrazione();
		
	}
	
		
}

