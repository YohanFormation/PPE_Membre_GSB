package gsb_interface;

import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb_requete_sql.requete;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ModifierUtilisateur extends JPanel {
	private JTextField text_id;
	private JTextField text_Nom;
	private JTextField text_Prenom;
	private JTextField text_Fonction;

	/**
	 * Create the panel.
	 */
	public ModifierUtilisateur() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 129, 570, 398);
		add(panel);
		
		text_id = new JTextField();
		text_id.setBounds(40, 13, 116, 22);
		add(text_id);
		text_id.setColumns(10);
		
		text_Nom = new JTextField();
		text_Nom.setColumns(10);
		text_Nom.setBounds(318, 48, 116, 22);
		add(text_Nom);
		
		text_Prenom = new JTextField();
		text_Prenom.setColumns(10);
		text_Prenom.setBounds(318, 13, 116, 22);
		add(text_Prenom);
		
		text_Fonction = new JTextField();
		text_Fonction.setColumns(10);
		text_Fonction.setBounds(318, 83, 116, 22);
		add(text_Fonction);
		
		JLabel lblNewLabel = new JLabel("Id :");
		lblNewLabel.setBounds(12, 16, 76, 16);
		add(lblNewLabel);
		
		JLabel label = new JLabel("Nom :");
		label.setBounds(256, 16, 76, 16);
		add(label);
		
		JLabel label_1 = new JLabel("Prenom :");
		label_1.setBounds(256, 51, 76, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("Fonction :");
		label_2.setBounds(256, 86, 76, 16);
		add(label_2);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(469, 47, 97, 25);
		add(btnModifier);

		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				requete co = new requete();
				co.ModifierDonnees(text_id.getText(),text_Nom.getText(), text_Prenom.getText(), text_Fonction.getText());
			}
		});
		
	}
}
