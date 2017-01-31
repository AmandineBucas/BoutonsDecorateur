package BoutonsDecorateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class majuscule extends JButton {
	
	public majuscule(JButton bouton) {
	
		// récupération du texte saisi à l'aide du constructeur JButton
		super(bouton.getText());
		
		// action sur le bouton
		for(ActionListener action : bouton.getActionListeners()){
			this.addActionListener(action);
		}
		
		this.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				// écrit le texte du bouton en majuscule
				setText(getText().toUpperCase());
			}
			
		});	
		
	}
}