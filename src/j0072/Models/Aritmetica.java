package j0072.Models;

/**
 * Questa classe nasce e si evolve per gli scopi didattici
 * del corso java <strong>j0072</strong> dell'Istituto CEFI.
 * <br /><br />
 * 
 * Viene utilizzata per una serie di esempi utili 
 * a mostrare i concetti rappresentativi di una classe.<br />
 * 
 * Ad esempio viene mostrato come utilizzare le variabili condivise
 * da tutte le istante mediante il modificatore "static",
 * oppure come usare diversi costruttori.<br />
 * 
 * Inoltre, implementa metodi di calcolo come Somma e Moltiplica.
 * 
 * @author Maurizio
 * @version 1.0
 * 
 */
public class Aritmetica {

	/**
	 * La variabile BY, condivisa da tutte le istanze della classe,
	 * conterrà il valore del numero passato al costruttore n. 2 
	 * (ovvero il costruttore che chiede un parametro di 
	 * tipo <i>long</i> in ingresso)
	 * se tale numero sarà meglio rappresentato come byte.
	 */
	public static byte BY;
	
	/**
	 * La variabile SH, condivisa da tutte le istanze della classe,
	 * conterrà il valore del numero passato al costruttore n. 2 
	 * (ovvero il costruttore che chiede un parametro di 
	 * tipo <i>long</i> in ingresso)
	 * se tale numero sarà meglio rappresentato come short.
	 */
	public static short SH;
	
	/**
	 * La variabile IN, condivisa da tutte le istanze della classe,
	 * conterrà il valore del numero passato al costruttore n. 2 
	 * (ovvero il costruttore che chiede un parametro di 
	 * tipo <i>long</i> in ingresso)
	 * se tale numero sarà meglio rappresentato come int.
	 */
	public static int IN;
	
	/**
	 * La variabile BY, condivisa da tutte le istanze della classe,
	 * conterrà il valore del numero passato al costruttore n. 2 
	 * (ovvero il costruttore che chiede un parametro di 
	 * tipo <i>long</i> in ingresso)
	 * se tale numero sarà meglio rappresentato come byte.
	 */	
	public static long LO;
	
	/**
	 * Costruttore n. 1<br />
	 * In questa classe viene esplicitato un costruttore
	 * vuoto al fine di poter creare istanze che possano
	 * invocarei metodi "Somma" e "Moltiplica".
	 */
	public Aritmetica() {
		
	}

	
	/**
	 * Costruttore n. 2 <br />
	 * Tale costruttore è stato aggiunto in data 11/10/2020
	 * al fine di poter svolgere un esercizio.
	 * Tale costruttore esegue una verifica del valore passato come
	 * parametro, valorizzando la variabile condivisa che meglio lo rappresenta.
	 * @param number Contiene un numero di tipo <i>long</i> che verrà controllato all'interno del costruttore.
	 */
	public Aritmetica(long number) {
		if (   number >= -128 
			&& number <= 127) BY = (byte) number;
		
		else if (   number >= -32768
				 && number <= 32767) SH = (short) number;
		
		else if (   number >= -2147483648
				 && number <= 2147483647) IN = (int) number;
		
		else if (   number >= -9223372036854775808L 
				 && number <= 9223372036854775807L) LO = number;
	}

	/**
	 * Fornisce il prodotto di due numeri di tipo <i>int</i>
	 * che vengono passati tra i suoi parametri di ingresso. 
	 * @param valore1 Primo valore da moltiplicare (moltiplicando)
	 * @param valore2 Secondo valore da moltiplicare (moltiplicatore)
	 * @return Il metodo ritorna un valore di tipo <i>int</i>
	 * che è il prodotto di <b>(valore1)*(valore2)</b>
	 */
	public int Moltiplica(int valore1, int valore2) {
		return valore1 * valore2;
	}

	/**
	 * Fornisce la somma di un insieme <b>non definito</b> di numeri interi
	 * utilizzando le <b>Variable Arguments</b> <i>(varargs)</i>.
	 * 
	 * @param i_miei_numeri E' una <i>varargs</i> di tipo intero che conterrà 
	 * l'insieme dei numeri interi che voglio sommare.
	 * @return Il metodo ritorna un numero intero che è la somma dei numeri
	 * passati tramite il parametro <b>i_miei_numeri</b>
	 */
	public int Somma(int... i_miei_numeri) {
		int risultato = 0; 
		for (int singolo_numero : i_miei_numeri) {
			risultato += singolo_numero;
		}
		return risultato;
	}

	/**
	 * Fornisce la somma di un insieme di numeri interi
	 * passati attraverso una stringa e separati dalla virgola.
	 * Viene invocato il metodo <i>split</i> della classe String
	 * al fine di ottenere un array di stringhe che successivamente 
	 * verranno analizzati come int mediante il metodo parseInt 
	 * della classe Integer e, quindi, sommati.
	 * @param stringa_di_numeri Stringa di numeri interi separati da virgola
	 * @return Il metodo ritorna un intero che è la somma dei numeri
	 * passati tramite il parametro <b>stringa_di_numeri</b> e separati da virgola. 
	 */
	public int Somma(String stringa_di_numeri) {
		int risultato = 0;
		String[] vettore = stringa_di_numeri.split(",");
		for (String singolo_numero : vettore) {
			risultato += Integer.parseInt(singolo_numero);
		}
		return risultato;
	}

	/**
	 * Fornisce un numero casuale compreso tra due numeri (minimo e massimo) estremi compresi.
	 * @param estremo1 Valore del primo estremo entro il quale calcolare il numero casuale
	 * @param estremo2 Valore del secondo estremo entro il quale calcolare il numero casuale
	 * @return Il metodo ritorna un numero casuale di tipo <i>byte</i> compreso tra i due estremi dati.
	 */
	public byte GeneraNumeroCasuale(byte estremo1, byte estremo2) {
		byte numerocasuale = (byte) ((Math.random() * estremo2) + estremo1);
		return numerocasuale;
	}

}
