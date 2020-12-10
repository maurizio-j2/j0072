package j0072.Ivanna;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class PunticinoGUI {

	public static void main(String[] args) {
		Frame finestra = new Frame("Povero punticino");
		
		Label lblX=new Label("Valore X: ");  
		lblX.setBounds(50,50, 150,20); 
		lblX.setBackground(Color.decode("0xccffff"));
		lblX.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lblX.setAlignment(Label.CENTER);
		TextField txtX=new TextField();  
		txtX.setBounds(210,50, 40,20); 
		
		Label lblY=new Label("Valore Y: ");  
		lblY.setBounds(50,100, 150,20); 
		lblY.setBackground(Color.decode("0xccffff"));
		lblY.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lblY.setAlignment(Label.CENTER);
		TextField txtY=new TextField();  
		txtY.setBounds(210,100, 40,20); 

		Button bottone = new Button("GO!");  
		bottone.setBounds(110,150,80,30);
		bottone.setBackground(Color.decode("0x00cccc"));
		
		Label risultato=new Label("per verificare inserisci i numeri");  
		risultato.setBounds(50,190, 200,20); 
		risultato.setBackground(Color.decode("0xffffcc"));
		risultato.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		risultato.setAlignment(Label.CENTER);
		
		bottone.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				
				PuntoPerGUI mioPunto = new PuntoPerGUI();
				
				// Verifico valore X
				if (Integer.parseInt(txtX.getText()) >= -10 &&
					Integer.parseInt(txtX.getText()) <= 10) {
					mioPunto.X = Integer.parseInt(txtX.getText());
					}
				
				// Verifico valore Y
				if (Integer.parseInt(txtY.getText()) >= -20 &&
					Integer.parseInt(txtY.getText()) <= 20) {
					mioPunto.Y = Integer.parseInt(txtY.getText());
					}
				
				// Se tutte le variabili sono valide scrivo la data sull'etichetta risultato
				// altrimenti scrivo che valore non è valido.
				if (mioPunto.X > -10 && mioPunto.X < 10)
			    if (mioPunto.Y > -20 && mioPunto.Y < 20){
					risultato.setText("Valore X = " +mioPunto.X + " ; Valore Y = " + mioPunto.Y); 
				} 
				else {
					risultato.setText("Valore non è valido!");
				}
				
				
				
				
			}  
			
		});
		
		finestra.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				}
				);

		finestra.setSize(300,230);  
		finestra.setLocationRelativeTo(null);
		finestra.setLayout(null);
		finestra.setBackground(Color.decode("0x006666"));
		finestra.setVisible(true);   
		finestra.add(lblX);  
		finestra.add(lblY);    
		finestra.add(txtX);
		finestra.add(txtY);
		finestra.add(bottone);
		finestra.add(risultato);  
	}




	}


