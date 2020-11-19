package j0072;

import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel; 

public class UsaAWTeSwing {  
	
    public static void main(String[] args) {  

    	// Dichiaro ed istanzio una nuova finestra
    	// mediante la classe JFrame 
    	JFrame finestra = new JFrame("Finestra di esempio");
    	
        
        // Dichiaro ed istanzio un nuovo JPanel
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        
        // Dichiaro ed istanzio una nuova JLabel
        JLabel label = new JLabel("Label di esempio");  
        JButton button = new JButton();  
        button.setText("Bottone di esempio");
        
        // Aggiungo al pannello la label ed il bottone
        panel.add(label);  
        panel.add(button);  
        
        // Aggiungo ala finestra il pannello
        finestra.add(panel);  
        
    	// Imposto le proprietà della finestra
    	finestra.setSize(800, 400);  
    	finestra.setLocationRelativeTo(null);  
    	finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	finestra.setVisible(true);  

    }  
}  