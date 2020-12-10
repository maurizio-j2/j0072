package j0072.Models;

@SuppressWarnings("unused")

public class Rettangolo {
    // Variabili di istanza
	private int x, y;
	private int width, height;

	// Incapsulamento delle variabili di istanza
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	public void setY(int y) {this.y = y;}
	public int getY() {return y;}
	public void setWidth(int width) {this.width = width;}
	public int getWidth() {return width;}
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	// Questa classe contiene una serie di costruttori.
	// Ogni costruttore inizializza tutte o alcune
	// variabili d'istanza della classe Rettangolo.
	
	// I costruttori forniscono un valore predefinito 
	// per qualsiasi variabile d'istanza 
	// anche nel caso in cui il valore iniziale non venga fornito da un argomento. 
    public Rettangolo() {
    	//Reference al costruttore con 4 parametri
        this(0, 0, 1, 1);
    }
    public Rettangolo(int width, int height) {
    	//Reference al costruttore con 4 parametri
        this(0, 0, width, height);
    }
    
    // I nomi degli identificatori delle variabili di istanza 
    // coincidono con i nomi dei parametri formali del costruttore. 
    // Per fare riferimento alle variabili di istanza 
    // il costruttore deve utilizzare la keyword this
    public Rettangolo(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
