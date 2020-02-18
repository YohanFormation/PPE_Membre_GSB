package gsb_interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb_requete_sql.requete;

public class SupprimerUtilisateur extends JPanel {
	private JTextField id;

	/**
	 * Create the panel.
	 */
	public SupprimerUtilisateur() {

		setLayout(null);

		id = new JTextField();
		id.setBounds(239, 164, 116, 22);
		add(id);
		id.setColumns(10);

		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(150, 167, 56, 16);
		add(lblNom);

		JButton btnEnregistrer = new JButton("enregistrer");
		btnEnregistrer.setBounds(239, 317, 116, 25);
		add(btnEnregistrer);

		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				requete co = new requete();
				co.SuppDonnees(id);
			}
		});

	}

}
