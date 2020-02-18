package gsb_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Scanner;

import gsb_dao.Dao;
import gsb_hibernate.Utilisateur;
import gsb_requete_sql.*;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Label;
import javax.swing.UIManager;

public class Interface extends JFrame {

	private JPanel contentPane;
	LireUtilisateur pannel_utilisateur = new LireUtilisateur();
	AjoutUtilisateur pannel_ajout = new AjoutUtilisateur();
	SupprimerUtilisateur pannel_supp = new SupprimerUtilisateur();
	ModifierUtilisateur pannel_modifier = new ModifierUtilisateur();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	requete co = new requete();

	public Interface() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Supprimer un utilisateur");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pannel_supp.setBounds(12, 13, 594, 534);
				setSize(1038, 608);
				setSize(1038, 607);
				contentPane.remove(pannel_ajout);
				contentPane.remove(pannel_utilisateur);
				contentPane.add(pannel_supp);
				/*
				 * co.LireDonneesOrdreAlpha(); System.out.println(""); co.SuppDonnees();
				 * System.out.println(""); co.LireDonneesOrdreAlpha();
				 */
			}
		});
		btnNewButton.setBounds(725, 484, 183, 46);
		contentPane.add(btnNewButton);

		JButton button = new JButton("Utilisateur");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// LireUtilisateur pannel_utilisateur = new LireUtilisateur();
				pannel_utilisateur.setBounds(12, 13, 594, 534);
				setSize(1038, 608);
				setSize(1038, 607);
				contentPane.remove(pannel_ajout);
				contentPane.remove(pannel_supp);
				contentPane.add(pannel_utilisateur);
				/*
				 * co.Connecter(); System.out.println(""); co.LireDonnees();
				 */
			}
		});
		button.setBounds(725, 307, 183, 46);
		contentPane.add(button);

		JButton button_1 = new JButton("Entrer un utilisateur");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// AjoutUtilisateur pannel_ajout = new AjoutUtilisateur();
				pannel_ajout.setBounds(12, 13, 594, 534);
				setSize(1038, 608);
				setSize(1038, 607);
				contentPane.remove(pannel_modifier);
				contentPane.remove(pannel_utilisateur);
				contentPane.remove(pannel_supp);
				contentPane.add(pannel_ajout);

				/*
				 * co.InsererDonnees(); System.out.println(""); co.LireDonneesOrdreAlpha();
				 */
			}
		});
		button_1.setBounds(725, 366, 183, 46);
		contentPane.add(button_1);

		JButton button_2 = new JButton("Modifier un utilisateur");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pannel_modifier.setBounds(12, 13, 594, 534);
				setSize(1038, 608);
				setSize(1038, 607);
				contentPane.remove(pannel_utilisateur);
				contentPane.remove(pannel_supp);
				contentPane.add(pannel_modifier);
			}
		});
		button_2.setBounds(725, 425, 183, 46);
		contentPane.add(button_2);

		JButton button_3 = new JButton("Connexion");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				co.Connecter();
			}
		});
		button_3.setBounds(725, 248, 183, 46);
		contentPane.add(button_3);

		/*
		 * JPanel panel = new JPanel(); panel.setBounds(12, 13, 594, 534);
		 * contentPane.add(panel);
		 */

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\apache-maven-3.6.3\\conf\\gsb.png"));
		lblNewLabel.setBounds(640, 13, 339, 203);
		contentPane.add(lblNewLabel);

	}
}