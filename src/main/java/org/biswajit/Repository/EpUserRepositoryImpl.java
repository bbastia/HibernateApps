package org.biswajit.Repository;

import java.util.List;

import org.biswajit.data.entities.EpUser;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class EpUserRepositoryImpl implements EpUserRepository {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	@Autowired
	HibernateTemplate   hibernateTemplate;
	
	public Session getCurrentSession() {
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		return session;
    }
	
	public EpUser getEpUserById(Long id) {
		return getCurrentSession().get(EpUser.class, id);
	}

	public void createUser(EpUser epUser) {
		getCurrentSession().save(epUser);
	}

	public void deleteUser(EpUser eUser) {
		getCurrentSession().delete(eUser);
	}

	public void updateUser(EpUser eUser) {

		getCurrentSession().update(eUser);
	}

	@SuppressWarnings("unchecked")
	public List<EpUser> getAll() {
		
		String hql = "from EpUser";
		Query query = getCurrentSession().createQuery(hql);
		List<EpUser> allUser = query.list(); 
		
//		String hql = "FROM EpUser as p where  ORDER BY p.id  ";
		return allUser;
	}

	
}
