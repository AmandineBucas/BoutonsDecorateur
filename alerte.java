package BoutonsDecorateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class alerte extends JButton {
	
	public alerte(JButton bouton) {
	
		// récupération du texte saisi à l'aide du constructeur JButton
		super(bouton.getText());
		
		// action sur le bouton
		for(ActionListener action : bouton.getActionListeners()){
			this.addActionListener(action);
		}
		
		this.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				// affiche une alerte avec le texte implémenté dans le bouton
				JOptionPane.showMessageDialog(null, getText());
			}
			
		});
		
	}
}