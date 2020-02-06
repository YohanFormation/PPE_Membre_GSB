package gsb_unit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import gsb_hibernate.HibernateUtil;

public class ConnexionHibernate {
	@Test
	public void connexion_bdd() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Assert.assertNotNull(sessionFactory);
		System.out.println("SessionFactory : " + sessionFactory);
		Session session = sessionFactory.openSession();
		Assert.assertNotNull(session);
		System.out.println("Session : " + session);
		session.close();
	}

}
