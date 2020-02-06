package gsb_dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import gsb_hibernate.HibernateUtil;

public class Dao<T> implements IDao<T> {
	Session session;
	Class<T> entiyClass;

	public Dao(Class<T> entiyClass) {
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		session = sessionfactory.openSession();
		this.entiyClass = entiyClass;
	}

	@Override
	public List<T> getAll() {
		Criteria criteria = session.createCriteria(entiyClass);
		List<T> items = criteria.list();
		return items;
	}

	@Override
	public T getById(int id) {
		return (T) session.get(entiyClass, id);
	}

	@Override
	public T add(T item) {
		Transaction transaction = session.beginTransaction();
		session.save(item);
		transaction.commit();
		return item;
	}

	@Override
	public T update(T item) {
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(item);
		transaction.commit();
		return item;
	}

	@Override
	public boolean delete(T item) {
		try {
			Transaction transaction = session.beginTransaction();
			session.delete(item);
			transaction.commit();
		} catch (Exception e) {
			return false;
		}
		return true;

	}
}
