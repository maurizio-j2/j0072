package j0072;

// Eseguo gli import per l'interfaccia grafica (GUI)
import java.awt.*;
import java.awt.event.*;


public class DataGUI {

	public static void main(String[] args) {

		Frame finestra = new Frame("Esempio di data"); 

		Label lblGiorno=new Label("Giorno:");  
		lblGiorno.setBounds(50,50, 150,20); 
		lblGiorno.setBackground(Color.decode("0xcfcfcf"));
		lblGiorno.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lblGiorno.setAlignment(Label.RIGHT);
		TextField txtGiorno=new TextField();  
		txtGiorno.setBounds(210,50, 20,20); 

		Label lblMese=new Label("Mese:");  
		lblMese.setBounds(50,80, 150,20); 
		lblMese.setBackground(Color.decode("0xcfcfcf"));
		lblMese.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lblMese.setAlignment(Label.RIGHT);
		TextField txtMese=new TextField();  
		txtMese.setBounds(210,80, 20,20); 

		Label lblAnno=new Label("Anno:");  
		lblAnno.setBounds(50,110, 150,20); 
		lblAnno.setBackground(Color.decode("0xcfcfcf"));
		lblAnno.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lblAnno.setAlignment(Label.RIGHT);
		TextField txtAnno=new TextField();  
		txtAnno.setBounds(210,110, 40,20); 

		Button bottone = new Button("Verifica");  
		bottone.setBounds(170,150,80,30);

		Label risultato=new Label("-");  
		risultato.setBounds(50,190, 200,20); 
		risultato.setBackground(Color.decode("0xfffec1"));
		risultato.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		risultato.setAlignment(Label.CENTER);


		bottone.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				
				DataOld miaData = new DataOld();
				
				// Verifico il giorno
				if (Integer.parseInt(txtGiorno.getText()) > 0 &&
					Integer.parseInt(txtGiorno.getText()) <= 31) {
					miaData.giorno = Integer.parseInt(txtGiorno.getText());
				}
				
				// Verifico il mese
				if (Integer.parseInt(txtMese.getText()) > 0 &&
					Integer.parseInt(txtMese.getText()) <= 12) {
					miaData.mese = Integer.parseInt(txtMese.getText());
					}
				
				// Verifico l'anno
				if (Integer.parseInt(txtAnno.getText()) > 0) {
					miaData.anno= Integer.parseInt(txtAnno.getText());
				}
				
				// Se tutte le variabili sono valide scrivo la data sull'etichetta risultato
				// altrimenti scrivo che la data non è valida.
				if (miaData.giorno > 0 && miaData.mese > 0 && miaData.anno > 0) {
					risultato.setText(miaData.giorno + "/" + miaData.mese + "/" + miaData.anno); 
				} else {
					risultato.setText("Data non valida!");
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
		finestra.setBackground(Color.decode("0x8ebd8e"));
		finestra.setVisible(true);   
		finestra.add(lblGiorno);  
		finestra.add(lblMese);  
		finestra.add(lblAnno);  
		finestra.add(txtGiorno);
		finestra.add(txtMese);
		finestra.add(txtAnno);
		finestra.add(bottone);
		finestra.add(risultato);  
	}

}

