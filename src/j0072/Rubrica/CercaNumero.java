package j0072.Rubrica;

// Eseguo gli import per l'interfaccia grafica (GUI)
import java.awt.*;
import java.awt.event.*;

// Eseguo gli import per poter gestire il file
import java.net.*; 
import java.io.*;
import java.util.*; 

public class CercaNumero {

	public static void main(String[] args) {

		// Finestra
		Frame finestra = new Frame("Rubrica telefonica"); 

		// Etichetta
		Label etichetta=new Label("Scrivi nome contatto:");  
		etichetta.setBounds(50,50, 150,20); 
		etichetta.setBackground(Color.decode("0xcfcfcf"));
		etichetta.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		etichetta.setAlignment(Label.RIGHT);

		// Casella di testo
		TextField caselladitesto=new TextField();  
		caselladitesto.setBounds(210,50, 150,20); 

		// Risultato
		Label risultato=new Label("-");  
		risultato.setBounds(50,150, 300,20); 
		risultato.setBackground(Color.decode("0xfffec1"));
		risultato.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		risultato.setAlignment(Label.CENTER);

		// Bottone
		Button bottone = new Button("Cerca numero");  
		bottone.setBounds(260,100,100,30);

		

		// Gestione del click sul bottone
		bottone.addActionListener(new ActionListener(){ 

			public void actionPerformed(ActionEvent e){ 
				try {
					// Recupero il file 
					// e ne creo un oggetto chiamato "mieicontatti"
					// tramite la classe Scanner
					URL url = getClass().getResource("Contatti.txt");
					File file = new File(url.getPath());
					Scanner mieicontatti = new Scanner(file);

					// "Fino a quando" (while) ho linee da poter scorrere su "mieicontatti"
					while (mieicontatti.hasNextLine()) {
						
						// Eseguo lo split tra il nome ed il numero
						// che sono separati dalla virgola
						String[] contatto = mieicontatti.nextLine().split(",");

						// Se il contatto che sto leggendo dall'oggetto "mieicontatti"
						// risulta uguale al testo che ho inserito sulla "caselladitesto"
						// visualizzo il risultato sulla label "risultato".
						if (contatto[0].equals(caselladitesto.getText())){
							risultato.setText(contatto[1]);
						}
					}
					
					// Chiudo l'oggetto Scanner
					mieicontatti.close();
					
				} catch (FileNotFoundException err1) {
					System.out.println("File non trovato");
				} catch (NullPointerException err2) {
					System.out.println("Puntamento non trovato");
				} 
			}  
		});



		// Aggiungo alla finestra il Listener degli eventi di Finestra
		finestra.addWindowListener(
				new WindowAdapter(){
					// Sull'Handler WindowClosing eseguo il comando
					// di uscita dall'applicazione.
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				}
				);

		finestra.setSize(400,200);  
		finestra.setLocationRelativeTo(null);
		finestra.setLayout(null);
		finestra.setBackground(Color.decode("0x8ebd8e"));
		finestra.setVisible(true);   
		finestra.add(etichetta);  
		finestra.add(caselladitesto);
		finestra.add(bottone);
		finestra.add(risultato);  
	}

}

