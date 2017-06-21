package org.biswajit.Test;

import java.util.Date;

import org.biswajit.data.entities.Bank;
import org.biswajit.hiberante.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Bank bank=new Bank();
		bank.setAddressLine1("36k,near park plaza");
		bank.setAddressLine2("Electronic city");
		bank.setCity("Bengaluru");
		bank.setZipCode("560100");
		bank.setState("karnataka");
		bank.setCreatedBy("Govt of India");
		bank.setCreatedDate(new Date());
		bank.setInternational(true);
		bank.setLastUpdatedBy("Govt of India");
		bank.setLastUpdatedDate(new Date());
		bank.setName("STATE BANK OF INDIA");
		bank.getContacts().put("Manager", "Biswajit");
		bank.getContacts().put("deputy manager", "sarvanan");
		session.save(bank);
		session.getTransaction().commit();
		session.close();
		
		Session sesssion1=factory.openSession();
		sesssion1.beginTransaction();
		Bank bank1=sesssion1.get(Bank.class, 1l);
		System.out.println(bank1.getContacts());
		session.close();
		
		
		
		System.exit(1);
	}
}
