package BoutonsDecorateur;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fenetre extends JFrame{
	
	public fenetre(){
			
		// taille de la fenêtre
	    this.setSize(600, 400); 
		
		// titre de la fenêtre
		this.setTitle("Bouton Décorateur");
             
		// initialisation d'un JPanel
	    JPanel panel = new JPanel();
	    
		// initialisation d'un bouton "Invisible"
	    JButton hide = new invisible(new JButton("Invisible"));
		
		// initialisation d'un bouton "Invisible"
	    JButton alert = new alerte(new JButton("Alerte"));
		
		// initialisation d'un bouton Majuscule
	    JButton upcase = new majuscule(new JButton("Majuscule"));
	    
		// action avec la classe "invisible" et la classe "alerte"
	    JButton hideAndAlert = new invisible(new alerte(new JButton("Invisible et Alerte"))); 
		JButton hideAndAlert = new invisible(alert); 
	    hideAndAlert.setText("Invisible et Alerte");
		
		// action avec la classe "alerte" et la classe "majuscule"
		JButton alertAndUpcase = new alerte(new majuscule(new JButton("Alerte et Majuscule"))); 
		JButton alertAndUpcase = new majuscule(alert); 
	    alertAndUpcase.setText("Alerte et Majuscule");
				
		// action avec la classe "invisible" et la classe "majuscule"
		JButton hideAndUpcase = new invisible(new majuscule(new JButton("Invisible et Majuscule"))); 
		JButton hideAndUpcase = new invisible(upcase); 
	    hideAndUpcase.setText("Invisible et Majuscule");
	    
		// ajout des composants du panel
	    panel.add(hide);
	    panel.add(alert);
	    panel.add(upcase);
	    panel.add(hideAndAlert);
	    panel.add(alertAndUpcase);
		panel.add(hideAndUpcase);
	    
		// affiche les composants du panel 
	    this.setContentPane(panel);  

		// rend visible le bouton
	    this.setVisible(true);
	}
		
	// main
	public static void main(String[] args){
		new fenetre();
	}
	
}