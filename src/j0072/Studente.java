package j0072;

public class Studente {
	private String nomeStudente;
	private int etaStudente;

	// Incapsulamento nomeStudente
	public String getNome() {
		return nomeStudente;
	}
	public void setNome(String nome) {
		nomeStudente = nome;
	}
	
	// Incapsulamento etaStudente
	public int getAnni() {
		return etaStudente;
	}
	public void setAnni(int eta) {
		etaStudente = eta;
	}
	
	// Incapsulamento di oggetti della stessa classe.
	// Il metodo getDifferenzaAnni mostra come sia possibile,
	// di accedere alla variabile etaStudente come se essa fosse "public".
	public int getDifferenzaAnni(Studente altroStudente) {
		return (etaStudente - altroStudente.etaStudente);
	}
	// E se dovessi aggiungere dei controlli all'attributo etaStudente?
	// Pensandoci bene, una miglior riflessione ci spingerebbe a 
	// farci usare il metodo altroStudente.getAnni
}
