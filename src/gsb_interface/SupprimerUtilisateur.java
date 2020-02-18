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
	private JTextField id;

	/**
	 * Create the panel.
	 */
	public SupprimerUtilisateur() {

		setLayout(null);
		requete co = new requete();
		JTextArea text_suppr = new JTextArea();
		text_suppr.setEditable(false);
		text_suppr.setBounds(12, 13, 570, 514);
		add(text_suppr);
		String result = ("Identifiant"+"  "+"Nom"+"  "+"Prenom"+"  "+"Fonction");
		String newLine = System.getProperty("line.separator");
		for (String iterable_element : co.LireDonnees()) {
			result = result + "\n" + iterable_element;
		}
		text_suppr.setText(result);

	}
}
