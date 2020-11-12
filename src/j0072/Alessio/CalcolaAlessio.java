package j0072.Alessio;

public class CalcolaAlessio {
 
		
		public static byte b;
		public static  short s;
		public static int i;
		public static long l;
		
		public CalcolaAlessio (long Numero) {
		    
		   
		    	   if (Numero < 127 && Numero > -128) 
		    	   { 
		    		  b =  (byte) Numero ;
		    		  System.out.println ("La mia età è una variabile di tipo byte");
		           }
		    	   else if (Numero < 32767 && Numero > -32768 ) 
		    	   {
		    		   s = (short) Numero ;
			    		  System.out.println ("La mia età è una variabile di tipo short");

		    	   }
		    	   
		    	   else if (Numero < 2147483647 && Numero > -2147483648)
		    	   {
		    		   i = (int) Numero;
		    			  System.out.println ("La mia età è una variabile di tipo int");
		    	   }
		    	   else if (Numero < 9223372036854775807L && Numero > -9223372036854775808L) 
		    	   {
		    		  l =  Numero ;
		    		  System.out.println ("La mia età è una variabile di tipo long");
		    	   }
		 }

}