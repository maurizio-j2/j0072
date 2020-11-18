package j0072.Alessio;

public class Estrazione {
	
	int MiaEstrazione(int min, int max){
		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
		  
		
	}
}


