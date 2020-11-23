package j0072.Lotto;

import java.awt.FlowLayout;  
import java.awt.event.*;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel; 

public class GiocaGUI {  
	
    public static void main(String[] args) {  

    	// Dichiaro ed istanzio i seguenti componenti:
    	// JFrame, JPanel, JLabel, JButton
    	JFrame finestra = new JFrame("Estrazioni del lotto");
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel();
        JButton button = new JButton();  
        button.setText("Esegui estrazione");
        
        // Aggiungo un Listener al JButton
        button.addActionListener(new ActionListener(){  
        	
        	//Aggiungo un Handler
        	public void actionPerformed(ActionEvent e){  
        		
        		// Istanzio l'oggetto "gioco"
        		// ed invoco il metodo che esegue
        		// l'estrazione casuale sulle tre ruote.
        		Lotto gioco = new Lotto();
        		gioco.Estrai();
        		
                // Eseguo un ciclo for per tutti gli elementi
        		// dell'oggetto "gioco" che al suo interno ha
        		// una proprietà di tipo String che contiene
        		// il nome della ruota,
        		// ed un array di byte da 5 elementi
        		// che contiene i numeri.
        		for (byte i = 0; i < gioco.ruote.length; i++) {
                	label.setText(
        					label.getText() + " " +
        					gioco.ruote[i].citta + " ");
                	// Identificata la ruota, procedo con
                	// il ciclo all'interno dell'array di byte
                	// che contiene i numeri della ruota attualmente selezionata
                	for (byte k = 0; k < gioco.ruote[i].numero.length; k++){
            			label.setText( label.getText() + " " + 
            					gioco.ruote[i].numero[k] + " ");
            		}
                }
        		
        		// Stampo i numeri anche sulla Console.
        		gioco.StampaRuote();
        	}  
        });  
        
    	// Aggiungo i componenti
        panel.add(label);  
        panel.add(button);  
        finestra.add(panel);  

        // Eseguo delle impostazioni slla finestra 
        finestra.setSize(800, 100);  
    	finestra.setLocationRelativeTo(null);  
    	finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	finestra.setVisible(true);  

    }  
}  