package j0072;

import java.util.*;
import j0072.Models.Aritmetica;

public class SommaDaTastiera {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String interi_digitati = input.nextLine();
		Aritmetica calcolatrice = new Aritmetica();
		
		System.out.println("La somma dei numeri digitati è: " 
							+ calcolatrice.Somma(interi_digitati));

	}

}
