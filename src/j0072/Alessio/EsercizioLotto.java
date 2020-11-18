package j0072.Alessio;

public class EsercizioLotto {

	public static void main(String[] args) {
		Lotto ruote_esercizio = new Lotto();
		
		String[][] showruote = ruote_esercizio.CreoArrayLotto();
        for (byte x = 0; x < showruote[0].length; ++x) {
       
        
        {
                System.out.println(showruote[0][x] +            		
                		   " " + showruote[1][x]  );
        }

	}

}
}
