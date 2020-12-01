package j0072.Augusto;

// Eseguo gli import per l'interfaccia grafica (GUI)
import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;

public class Prendimi {

	public static void main(String[] args) {
		
		// posizione bottone X e Y
		int posizineBottoneX = 260; 
		int posizioneBottoneY = 100;
		
		// finestra dimensione
		int dimensioneFinestraX = 600;
		int dimensioneFinestraY = 400;
		
		// creo Finestra
		Frame finestra = new Frame("Prendimi Mini Game"); 

		// creo Bottone
		Button bottone = new Button("Clicca su di me");  
		bottone.setBounds(posizineBottoneX,posizioneBottoneY,100,30);
		
		// calcolo spazio disponibile
		int spazioDisponibileX =  dimensioneFinestraX - 100;
		int spazioDisponibileY = dimensioneFinestraY - 30;
		
		boolean preso = false;

		// Gestione del click sul bottone
		bottone.addActionListener(new ActionListener(){ 
						
			public void actionPerformed(ActionEvent e){ 
				
				// preso = true;
			}  
		}); 
		
		// cambio posizione bottone
		while ( preso == false ) {
			posizineBottoneX = (short) ((Math.random() * spazioDisponibileX) + 30);
			posizioneBottoneY = (short) ((Math.random() * spazioDisponibileY) + 30);
			bottone.setBounds(posizineBottoneX, posizioneBottoneY, 100,30);
			preso = true; // sarebbe con il click sul bottone ma per prova scrivo così			
		}	

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

		finestra.setSize(dimensioneFinestraX, dimensioneFinestraY);  
		finestra.setLocationRelativeTo(null);
		finestra.setLayout(null);
		finestra.setBackground(Color.decode("0x8ebd8e"));
		finestra.setVisible(true);   
		finestra.add(bottone);

	}

}

