package gsb_interface;

import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb_requete_sql.requete;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AjoutUtilisateur extends JPanel {
	private JTextField text_nom;
	private JTextField text_prenom;
	private JTextField text_fonction;

	/**
	 * Create the panel.
	 */
	public AjoutUtilisateur() {
		setLayout(null);

		text_nom = new JTextField();
		text_nom.setBounds(239, 164, 116, 22);
		add(text_nom);
		text_nom.setColumns(10);

		text_prenom = new JTextField();
		text_prenom.setBounds(239, 209, 116, 22);
		add(text_prenom);
		text_prenom.setColumns(10);

		text_fonction = new JTextField();
		text_fonction.setBounds(239, 254, 116, 22);
		add(text_fonction);
		text_fonction.setColumns(10);

		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(150, 167, 56, 16);
		add(lblNom);

		JButton btnEnregistrer = new JButton("enregistrer");
		btnEnregistrer.setBounds(239, 317, 116, 25);
		add(btnEnregistrer);

		JLabel label = new JLabel("Prenom");
		label.setBounds(150, 212, 56, 16);
		add(label);

		JLabel label_1 = new JLabel("Fonction");
		label_1.setBounds(150, 257, 56, 16);
		add(label_1);

		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				requete co = new requete();
				co.InsererDonnees(text_nom.getText(), text_prenom.getText(), text_fonction.getText());
				javax.swing.JOptionPane.showMessageDialog(null,"Utilisateur ajouté!");
			}
		});

	}
}
