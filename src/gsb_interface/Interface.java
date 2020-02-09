package gsb_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JTextArea;

public class Interface extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 673, 493);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Supprimer un utilisateur");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(460, 283, 183, 46);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Utilisateur");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				co.Connecter();
			}
		});
		button.setBounds(460, 106, 183, 46);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Entrer un utilisateur");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_1.setBounds(460, 165, 183, 46);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Modifier un utilisateur");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(460, 224, 183, 46);
		contentPane.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 438, 420);
		contentPane.add(panel);
		
		
	}
}