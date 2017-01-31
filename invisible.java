package BoutonsDecorateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class invisible extends JButton{
	
	public invisible(JButton bouton) {
	
		// récupération du texte saisi à l'aide du constructeur JButton
		super(bouton.getText());
		
		// action sur le bouton
		for(ActionListener action : bouton.getActionListeners()){
			this.addActionListener(action);
		}
		
		this.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				// rend invisible le bouton, reste toujours cliquable
				setVisible(false);
			}
			
		});	
		
	}
}