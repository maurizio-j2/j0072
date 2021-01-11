package j0072.Andrea.Gestionale;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

public class GestionaleGUI {
	
	private Anagrafica anagrafica;

	private Label txtMatricola;
	private Label txtCognNome;
	private Label txtRuolo;  
	private MenuBar menubar;
	private Frame finestra;
	
	private void InizializzaComponenti() {
		finestra= new Frame("Gestionale");  
        
        menubar=new MenuBar();  

        // Esempio di menù
        Menu menu1=new Menu("Menu di esempio");  
        MenuItem elemento1=new MenuItem("Voce n. 1");  

        Menu sottomenu1=new Menu("Voce n. 2");  
        MenuItem sottomenu1_1=new MenuItem("Voce n. 2-1");  
        MenuItem sottomenu1_2=new MenuItem("Voce n. 2-3");  
        sottomenu1.add(sottomenu1_1);  
        sottomenu1.add(sottomenu1_2);  

        MenuItem elemento3=new MenuItem("Voce n. 3");  

        menu1.add(elemento1);  
        menu1.add(sottomenu1);  
        menu1.add(elemento3);  

        Menu menu2=new Menu("Altra voce");  

        menubar.add(menu1);  
        menubar.add(menu2);  
        
		Label lblMatricola=new Label("Matricola:");  
		lblMatricola.setBounds(450,55, 150,20); 
		lblMatricola.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
		lblMatricola.setAlignment(Label.RIGHT);
		finestra.add(lblMatricola);

		Label lblCognNome=new Label("Cognome e nome:");  
		lblCognNome.setBounds(450,75, 150,20); 
		lblCognNome.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
		lblCognNome.setAlignment(Label.RIGHT);
		finestra.add(lblCognNome);

		Label lblRuolo=new Label("Ruolo:");  
		lblRuolo.setBounds(450,95, 150,20); 
		lblRuolo.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
		lblRuolo.setAlignment(Label.RIGHT);
		finestra.add(lblRuolo);

		txtMatricola=new Label();  
		txtMatricola.setBounds(610,55, 150,20); 
		txtMatricola.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		txtMatricola.setAlignment(Label.LEFT);
		finestra.add(txtMatricola);

		txtCognNome=new Label();  
		txtCognNome.setBounds(610,75, 150,20); 
		txtCognNome.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		txtCognNome.setAlignment(Label.LEFT);
		finestra.add(txtCognNome);

		txtRuolo=new Label();  
		txtRuolo.setBounds(610,95, 150,20); 
		txtRuolo.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		txtRuolo.setAlignment(Label.LEFT);
		finestra.add(txtRuolo);

		finestra.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				}
				);
		
		finestra.setSize(800,600);  
		finestra.setLocationRelativeTo(null);
		finestra.setLayout(null);
		finestra.setBackground(Color.decode("0xf8ee97"));
		finestra.setVisible(true);   
	}

	private void CreaMenuInBaseAlRuolo() {
        Menu menuruolo = new Menu();
        byte k;
//        for (k=0; k < /* Per tutta la luncherra dell'array Menù */; ++k) {
//        	if ( k==0 ) {
//        		/* Setto la prima voce del menù */
//        		menuruolo.setLabel(this.anagrafica.getMenu()[0]);
//        	} else {
//        		/* Setto le voci seguenti del menù */
//                MenuItem vocemenu = new MenuItem(/* Da completare */);
//                menuruolo.add(vocemenu);
//        		
//        	}
//        }
        menubar.add(menuruolo);
        finestra.setMenuBar(menubar);  
	}
	
	// GestionaleGUI si può "costruire" solo se gli passo una matricola valida
	public GestionaleGUI(/* matricola*/) throws FileNotFoundException {
		
		InizializzaComponenti();

		// Recupero le informazioni di anagrafica utente
		// istanziando una nuova classe Anagrafica
		/* Da completare */

		// Poichè "anagrafica" è una variabile d'istanza
		//this.anagrafica = /* l'oggetto appena istanziato */;
		
		/* Procedo a settare le tre etichette della GUI */

		/* Quindi invoco il metodo CreaMenuInBaseAlRuolo()
		 * per settare anche il menù*/
		CreaMenuInBaseAlRuolo();

	}
	
}

