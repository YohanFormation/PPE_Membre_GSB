package gsb_main;
import java.util.List;
import java.util.Scanner;

import gsb_dao.Dao;
import gsb_hibernate.Utilisateur;
import gsb_requete_sql.*;
import gsb_interface.*;

public class Main {
	public static void main(String[] args) {
		
		Interface fen = new Interface();
		fen.setVisible(true);
		
		/*Dao<Utilisateur> dao = new Dao<Utilisateur>(Utilisateur.class);
		List<Utilisateur> utilisateur = dao.getAll();
		for (Utilisateur Utilisateur : utilisateur) {
			System.out.println(Utilisateur.getPrenom() + " " + Utilisateur.getNom());
		}
		System.out.println("*************************************************");
		
		Scanner sc = new Scanner(System.in);
		requete co = new requete();
		int choix;
		co.Connecter()
		System.out.println("Saisir une valeur : ");
		System.out.println("");
		System.out.println("1: Lire les données");
		System.out.println("");
		System.out.println("2 :Lire les données dans l'ordre alphabetique");
		System.out.println("");
		System.out.println("3: Ajouter un utilisateur");
		System.out.println("");
		System.out.println("4: Supprimer un utilisateur");
		choix = sc.nextInt();
		if(choix == 1) {
			co.LireDonnees();
		}
		if(choix == 2) {
			co.LireDonneesOrdreAlpha();
		}if(choix == 3) {
			co.InsererDonnees();
			System.out.println("");
			co.LireDonneesOrdreAlpha();
		}
		if(choix == 4) {
			co.LireDonneesOrdreAlpha();
			System.out.println("");
			co.SuppDonnees();
			System.out.println("");
			co.LireDonneesOrdreAlpha();
		}

		System.out.println("*************************************************");*/
	}
}