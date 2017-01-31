package BoutonsDecorateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class couleur extends JButton {
	
	public couleur(JButton bouton) {
	
		// récupération du texte saisi à l'aide du constructeur JButton
		super(bouton.getText());
		
		// action sur le bouton
		for(ActionListener action : bouton.getActionListeners()){
			this.addActionListener(action);
		}
		
		this.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				// change la couleur du premier plan du bouton
				setForeground(Red);
			}
			
		});
		
	}
}