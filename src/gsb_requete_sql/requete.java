package gsb_requete_sql;
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import gsb_hibernate.*;
import gsb_dao.*;


public class requete {
	
	private static Connection connection;

	public static void main(String[] args) {
					System.out.println("Java JDBC");
    	Connecter();
		InsererDonnees(null, null, null);
		SuppDonnees(null);
		ModifierDonnees(null, null, null, null);
		LireDonnees();
		LireDonneesOrdreAlpha();
	}

	public requete() {
		Connecter();
	}
	public static void Connecter() {
		/*
		 * Connexion a la bdd 
		 */

		String connection_string="jdbc:mysql://localhost/gsb_utilisateur?user=root&password=";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(connection_string);
			System.out.println("Connexion a la base de données réussi");
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erreur :"+e);
			// e.printStackTrace();
		}
	}
	
	public static List<String> LireDonnees(){
		Statement stmt;
		ResultSet rs;
		List<String> resultat = new ArrayList<String>();
		try {
		stmt=connection.createStatement();
		String sql=("select * from utilisateur");
		rs=stmt.executeQuery(sql);
		System.out.println("Données présente en base :");
		while(rs.next()) {
			resultat.add(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return resultat;
	}
	
	public static void LireDonneesOrdreAlpha(){
		Statement stmt;
		ResultSet rs;
		try {
		stmt=connection.createStatement();
		String sql=("select * from utilisateur order by Nom");
		rs=stmt.executeQuery(sql);
		System.out.println("Données présente en base dans l'ordre alphabétique:");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	
	public static void InsererDonnees(String Nom, String prenom, String fonction) {
		Statement stmt;
	
		try {
			stmt=connection.createStatement();
			String sql="INSERT INTO utilisateur(id, Nom, Prenom, Fonction) VALUES(NULL, '"+Nom+"','"+prenom+"', '"+fonction+"')";
			stmt.executeUpdate(sql);
			System.out.println("Insertion des donées réussis");
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void SuppDonnees(Integer id) {
		Statement stmt;
		
		try {
			stmt=connection.createStatement();
			String sql="DELETE FROM utilisateur WHERE id='"+id+"'";
			stmt.executeUpdate(sql);
			// System.out.println("Suppression du compte possedant l'id '"+id+"' réussi");
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void ModifierDonnees(Integer id, String Nom, String Prenom, String Fonction) {
		Statement stmt;
		try {
			stmt=connection.createStatement();
			String sql="UPDATE utilisateur SET Nom = '"+Nom+"', Prenom = '"+Prenom+"', Fonction = '"+Fonction+"' WHERE utilisateur.id = '"+Integer.toString(id)+"';";
			stmt.executeUpdate(sql);
			System.out.println("Modification OK");
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	

}
