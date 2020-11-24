package j0072.Andrea;

public class ProvaLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	LottoAndrea lotto_andrea = new LottoAndrea();
	    	System.out.println(lotto_andrea.DammiArrayRuota()[0][2] + " " + lotto_andrea.DammiArrayRuota()[1][2]);
	    	String[] numeriRuota = lotto_andrea.DammiArrayRuota()[1][2].split(",");
	    	System.out.println(numeriRuota[2]);
	    	for (int x = 0; x < 10; x++) {
	    		System.out.println(x);
	    		
	    	} 
	    	
	    
	}

}
