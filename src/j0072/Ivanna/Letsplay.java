package j0072.Ivanna;

public class Letsplay {

	public static void main(String[] args) {
		Lotto mylotto = new Lotto();
		Ruota[] mieruote = mylotto.GetCityNumber();
		for (Ruota singolaruota : mieruote){
			System.out.println(singolaruota.nomecittà);
			System.out.println(singolaruota.numero1);
			System.out.println(singolaruota.numero3);
			System.out.println(singolaruota.numero5);
		
		}
			
			
	}

}
