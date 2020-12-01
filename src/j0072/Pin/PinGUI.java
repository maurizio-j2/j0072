package j0072.Pin;

// Eseguo gli import per l'interfaccia grafica (GUI)
import java.awt.*;
import java.awt.event.*;

public class PinGUI{

	public static void main(String[] args) {

		// Finestra
		Frame finestra = new Frame("Pin"); 

		// Etichetta
		Label etichetta=new Label("Inserisci il PIN:");  
		etichetta.setBounds(50,50, 150,20); 
		etichetta.setBackground(Color.decode("0xcfcfcf"));
		etichetta.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		etichetta.setAlignment(Label.RIGHT);

		// Casella di testo
		TextField caselladitesto = new TextField();
		caselladitesto.setBounds(210,50, 150,20);

		// Risultato
		Label risultato=new Label("-");  
		risultato.setBounds(50,150, 300,20); 
		risultato.setBackground(Color.decode("0xfffec1"));
		risultato.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		risultato.setAlignment(Label.CENTER);

		// Bottone
		Button bottone = new Button("Procedi");  
		bottone.setBounds(260,100,100,30);
		bottone.setEnabled(false);

		final Pin myPin = new Pin();

		caselladitesto.addKeyListener(
				new KeyListener(){

					@Override
					public void keyPressed(KeyEvent e){
						// Alla pressione del tasto
						// controllo il raggiungimento della lungezza del Pin (4 caratteri)
						// e la pressione del tasto "DEL" (tasto di cancellazione),
						// quindi "consumo" l'evento.
						if (caselladitesto.getText().length() > 3 
								&& e.getKeyCode() != 8) {
							e.consume();
						}
					}

					@Override
					public void keyTyped(KeyEvent e) {
					}

					@Override
					public void keyReleased(KeyEvent e) {
						// Se ho raggiunto i 4caratteri del Pin
						// abilito il bottone.
						if (caselladitesto.getText().length() == 4) {
							bottone.setEnabled(true);
						} else {
							bottone.setEnabled(false);

						}
					}
				}
				);



		// Gestione del click sul bottone
		bottone.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				try {
					short verifyFormat = Short.parseShort(caselladitesto.getText()); 
					try {
						risultato.setText(myPin.VerificaPin(verifyFormat));
					}
					catch (PinException ex1) {
						risultato.setText(ex1.toString());
					} 
					catch (PinSecurityException ex2) {
						// Disabilito la casella e il bottone
						caselladitesto.setEnabled(false);
						bottone.setEnabled(false);
						risultato.setText(ex2.toString());
					}				
				} catch (NumberFormatException ex) {
					risultato.setText("Formato errato. Il Pin deve essere un numero.");
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

