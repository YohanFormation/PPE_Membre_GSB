package gsb_interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gsb_requete_sql.requete;
import javax.swing.JList;

public class SupprimerUtilisateur extends JPanel {
	private JTextField text_id;

	/**
	 * Create the panel.
	 */
	public SupprimerUtilisateur() {
		setLayout(null);
		LireUtilisateur pannel_utilisateur = new LireUtilisateur();
		pannel_utilisateur.setBounds(12, 66, 570, 463);
		add(pannel_utilisateur);

		text_id = new JTextField();
		text_id.setBounds(47, 10, 116, 22);
		add(text_id);
		text_id.setColumns(10);

		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(12, 13, 56, 16);
		add(lblId);

		
		JButton btnRafraichirDonnes = new JButton("Rafraichir Donn\u00E9es");
		btnRafraichirDonnes.setBounds(438, 9, 144, 25);
		add(btnRafraichirDonnes);
		btnRafraichirDonnes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				requete co = new requete();
				pannel_utilisateur.AcutaliserDonnees();
			}
		});
		
		JButton btnNewButton = new JButton("Supprimer");
		btnNewButton.setBounds(12, 42, 97, 25);
		add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				requete co = new requete();
				co.SuppDonnees(Integer.parseInt(text_id.getText()));
				pannel_utilisateur.AcutaliserDonnees();
			}
		});

	}
}
