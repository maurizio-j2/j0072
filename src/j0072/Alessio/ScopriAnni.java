package j0072.Alessio;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.*;
import java.util.*;
import java.lang.*;
public class ScopriAnni {

	public static void main(String []args) {
		
		CreaStudenti opera_studenti = new CreaStudenti();
		Studenti [] estrai_studenti = opera_studenti.stud;
	

		
			for (Studenti studente : estrai_studenti){
				 {
					
					System.out.println(studente.nome);
					
				
					}
				
		Frame frame = new Frame(" Scopri gli anni");
		frame.setBounds(50, 50, 400, 300);
		Label etichetta = new Label ("Cerca studente per nome");
		etichetta.setBounds(20,50,180,20);
		etichetta.setBackground(Color.decode("0xffffff"));
		
		
		TextField caselladitesto = new TextField();  
		caselladitesto.setBounds(210,50, 150,20); 
		
		Label risultato=new Label("Scopri quanti anni mancano per diventare variabile short");  
		risultato.setBounds(20,150, 360,20); 
		risultato.setBackground(Color.decode("0xfffec1"));
		risultato.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		
		
		Button bottone = new Button("Cerca studente");  
		bottone.setBounds(100,100,200,30);


				
			

		
		bottone.addActionListener(new ActionListener()	{
			
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				CreaStudenti opera_studenti = new CreaStudenti();
				Studenti [] estrai_studenti = opera_studenti.stud;
			

				
					for (Studenti studente : estrai_studenti){
						if (caselladitesto.getText().equals(studente.nome)) {
							int result = (Byte.MAX_VALUE - studente.anni);
							final	String resultforlabel = Integer.toString(result);
							risultato.setText("Mancano " + resultforlabel + " anni.");
						
							
						}
						
						}
					

				
						
					}

			

			
				
			});
		
		frame.addWindowListener(
				new WindowAdapter(){
					// Sull'Handler WindowClosing eseguo il comando
					// di uscita dall'applicazione.
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
						
						
					}
				}
				);

		frame.setSize(400,200);  
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setBackground(Color.decode("0x8ebd8e"));
		frame.setVisible(true);   
		frame.add(etichetta);  
		frame.add(caselladitesto);
		frame.add(bottone);
		frame.add(risultato);  
		
				
			}
}}
	
