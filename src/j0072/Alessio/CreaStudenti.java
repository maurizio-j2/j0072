package j0072.Alessio;


public class CreaStudenti {

	public Studenti[] stud;

	
	public   CreaStudenti() {
	
	Studenti al = new Studenti("Alessio", 29);
	al.nome = "Alessio";
	al.anni = 29;
	Studenti au = new Studenti("Augusto", 32);
	au.nome = "Augusto";
	au.anni = 32;
	Studenti iv= new Studenti("Ivanna", 28);
	iv.nome = "Ivanna";
	iv.anni = 28;
	Studenti giu = new Studenti("Giuliano", 30);
	giu.nome = "Giuliano";
	giu.anni = 30;
	Studenti and = new Studenti("Andrea", 29);
    and.nome = "Andrea";
    and.anni = 29;
	Studenti [] lista_studenti = new Studenti[5];
	lista_studenti[0] = al;
	lista_studenti[1]= au;
	lista_studenti [2]= iv;
	lista_studenti [3] = giu;
	lista_studenti [4] = and;
	
	stud = lista_studenti;
	
	
	}
	public void Sottrai() {
		 for (Studenti ognuno : stud) {
			 int result = Short.MAX_VALUE - ognuno.anni;
			 
		 }
	}
	

   
}
