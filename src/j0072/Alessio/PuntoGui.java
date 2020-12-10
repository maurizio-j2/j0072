package j0072.Alessio;
/** creo una piccola interfaccia per inserire le coordinate x e y del Punto
 * 
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PuntoGui {
	public static  void main (String[] args) 
	{
		Punto xy = new Punto();
		Frame finestra = new Frame("Interfaccia coordinate"); 

		Label label_x = new Label("inserisci x");  

		/** Label e casella per inserire coordinata x
		*/
		
		label_x.setBounds(50,50, 100,20); 
		label_x.setBackground(Color.decode("0xcfcfcf"));	
		label_x.setFont(new Font(Font.DIALOG, Font.BOLD, 14));	
		label_x.setAlignment(Label.RIGHT);
		TextField caselladitestox=new TextField();  
		caselladitestox.setBounds(210,50, 150,20); 
		
		/**
		 * label e casella per inserire la coordinata y
		 */
		
		Label label_y = new Label("inserisci y");
		label_y.setBounds(50,80,100,20);
		label_y.setBackground(Color.decode("0xcfcfcf"));
		label_y.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		label_y.setAlignment(Label.RIGHT);
		TextField caselladitestoy=new TextField();  
		caselladitestoy.setBounds(210,80, 150,20); 
		
		/** label dove appare il risultato
		 * 
		 */
		
		Label coordinate = new Label("-");  
		coordinate.setBounds(50,150, 300,20); 
		coordinate.setBackground(Color.decode("0xfffec1"));
		coordinate.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		coordinate.setAlignment(Label.CENTER);
		
		Button bottone = new Button("Esegui");  
		bottone.setBounds(300,100,60,40);
		
		/** nel bottone inserisco un try per stampare il risultato e settare le coordinate
		 *  e un catch che lancia eccezione in caso di valori non validi
		 * 
		 */
		
		bottone.addActionListener(new ActionListener(){  
		   public void actionPerformed(ActionEvent e){  

		try {	
				xy.setX(Integer.parseInt(caselladitestox.getText()));
				xy.setY(Integer.parseInt(caselladitestoy.getText()));
				
				
				coordinate.setText(
						"I punti sono: " + "x = " +  xy.getX() + " e y = " + xy.getY()
						);  
			}  
		  catch (PuntoException ex) {
			  coordinate.setText("Valori non validi");
		  }
		   }
		   
		});
		
		/** 
		 * aggiungo tutto alla finestra e creo uscita
		 */
		
		finestra.addWindowListener(
				new WindowAdapter(){
					
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
		
	
		finestra.add(label_x);  
		finestra.add(label_y);
		finestra.add(caselladitestox);
		finestra.add(caselladitestoy);
		finestra.add(bottone);
		finestra.add(coordinate);  

	}


		
		
	}


