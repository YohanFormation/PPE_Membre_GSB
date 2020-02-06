package gsb_requete_sql;
import java.sql.*;
import java.util.Scanner;
import java.util.List;

import gsb_hibernate.*;
import gsb_dao.*;


public class requete {
	
	private static Connection connection;

	public static void main(String[] args) {
					System.out.println("Java JDBC");
    	Connecter();
		InsererDonnees();
		SuppDonnees();
		// ModifierDonnees();
		LireDonnees();
		LireDonneesOrdreAlpha();
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
	
	public static void LireDonnees(){
		Statement stmt;
		ResultSet rs;
		try {
		stmt=connection.createStatement();
		String sql=("select * from utilisateur");
		rs=stmt.executeQuery(sql);
		System.out.println("Données présente en base :");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
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
	
	public static void InsererDonnees() {
		Statement stmt;
		Scanner sc = new Scanner(System.in);
		System.out.print( "Nom : " );
        String Nom = sc.nextLine();
        System.out.print( "Prenom : " );
        String Prenom = sc.nextLine();
        System.out.print( "Fonction : " );
        String Fonction = sc.nextLine();
		try {
			stmt=connection.createStatement();
			String sql="INSERT INTO utilisateur(id, Nom, Prenom, Fonction) VALUES(NULL, '"+Nom+"','"+Prenom+"', '"+Fonction+"')";
			stmt.executeUpdate(sql);
			System.out.println("Insertion des donées réussis");
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void SuppDonnees() {
		Statement stmt;
		System.out.println("Saisir l'id du compte a supprimer");
		Scanner sc = new Scanner(System.in);
		System.out.print( "Id : " );
        Integer id = sc.nextInt();
		try {
			stmt=connection.createStatement();
			String sql="DELETE FROM utilisateur WHERE id='"+id+"'";
			stmt.executeUpdate(sql);
			System.out.println("Suppression du compte possedant l'id '"+id+"' réussi");
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	/*
	public static void ModifierDonnees() {
		Statement stmt;
		try {
			stmt=connection.createStatement();
			String sql="UPDATE users SET `Nom` = 'Albuquerque' WHERE `users`.`id` = 1;";
			stmt.executeUpdate(sql);
			System.out.println("Modification OK");
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	*/

}
