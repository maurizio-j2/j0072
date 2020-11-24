package j0072;
import java.awt.*;
import java.awt.event.*;

public class UsaAWT {

	public static void main(String[] args) {
		Frame finestra = new Frame("Esempio di uso AWT"); 

		Label etichetta=new Label("Inserisci un testo:");  

		// Imposto la posizione e la dimensione dell'etichetta
		etichetta.setBounds(50,50, 150,20); 

		// Imposto il colore di sfondo dell'etichetta a grigio chiaro
		etichetta.setBackground(Color.decode("0xcfcfcf"));

		// Aumento la dimensione del font e specifico il grassetto
		etichetta.setFont(new Font(Font.DIALOG, Font.BOLD, 14));

		// Imposto l'allineamento a destra
		etichetta.setAlignment(Label.RIGHT);

		TextField caselladitesto=new TextField();  
		caselladitesto.setBounds(210,50, 150,20); 
		
		Label risultato=new Label("-");  
		risultato.setBounds(50,150, 300,20); 
		risultato.setBackground(Color.decode("0xfffec1"));
		risultato.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		risultato.setAlignment(Label.CENTER);
		
		Button bottone = new Button("Esegui");  
		bottone.setBounds(300,100,60,30);

		bottone.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				risultato.setText(
						"Hai scritto: \"" +  caselladitesto.getText() + "\""
						);  
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
		
		//Imposto le misure della finestra (in pixel)
		finestra.setSize(400,200);  
		
		// Posiziono la finestra al centro dello schermo
		finestra.setLocationRelativeTo(null);
		
		// Imposto il layout a null
		finestra.setLayout(null);
		
		// Imposto il colore di sfondo della finestra a verde chiaro
		finestra.setBackground(Color.decode("0x8ebd8e"));
		
		// Imposto la visibilità a "true"
		finestra.setVisible(true);   
		
		// Aggiungo i componenti alla finestra
		finestra.add(etichetta);  
		finestra.add(caselladitesto);
		finestra.add(bottone);
		finestra.add(risultato);  

	}

}
