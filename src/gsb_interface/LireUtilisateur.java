package gsb_interface;

import gsb_requete_sql.*;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class LireUtilisateur extends JPanel {

	JTextArea text_fonction = new JTextArea();
	public LireUtilisateur() {
		requete co = new requete();
		setLayout(null);
		text_fonction.setEditable(false);
		text_fonction.setBounds(12, 13, 570, 514);
		add(text_fonction);
		String result = ("Id" + "  " + "Nom" + "  " + "Prenom" + "  " + "Fonction");
		String newLine = System.getProperty("line.separator");
		for (String iterable_element : co.LireDonnees()) {
			result = result + "\n" + iterable_element;
		}
		text_fonction.setText(result);
	}

	public void AcutaliserDonnees() {
		requete co = new requete();
		setLayout(null);
		text_fonction.setEditable(false);
		text_fonction.setBounds(12, 13, 570, 514);
		add(text_fonction);
		String result = ("Id"+"  "+"Nom"+"  "+"Prenom"+"  "+"Fonction");
		String newLine = System.getProperty("line.separator");
		for (String iterable_element : co.LireDonnees()) {
			result = result +"\n"+ iterable_element;
		}
		text_fonction.setText(result);
	}
}
