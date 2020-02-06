package gsb_main;
import java.util.List;
import gsb_dao.Dao;
import gsb_hibernate.Utilisateur;

public class Main {
	public static void main(String[] args) {
		Dao<Utilisateur> dao = new Dao<Utilisateur>(Utilisateur.class);
		List<Utilisateur> utilisateur = dao.getAll();
		for (Utilisateur Utilisateur : utilisateur) {
			System.out.println(Utilisateur.getPrenom() + " " + Utilisateur.getNom());
		}
	}
}