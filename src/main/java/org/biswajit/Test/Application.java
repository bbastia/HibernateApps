package org.biswajit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.biswajit.data.entities.Account;
import org.biswajit.data.entities.Address;
import org.biswajit.data.entities.Bank;
import org.biswajit.data.entities.Credential;
import org.biswajit.data.entities.Transaction;
import org.biswajit.data.entities.User;
import org.biswajit.hiberante.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
		
		//SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		SessionFactory sessionFactory=context.getBean(SessionFactory.class);
		
		
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
		Credential credential=new Credential();
		credential.setUsername("bbastia");
		credential.setPassword("password");
		
		User user=new User();
		user.setFirstName("biswajit");
		user.setLastName("bastia");
		user.setEmailAddress("bbastia@cisco.com");
		user.setAge(25);
		Calendar cal=Calendar.getInstance();
		cal.set(1992, 01, 13);
		user.setBirthDate(cal.getTime());
		user.setCreatedBy("biswa");
		user.setCreatedDate(new Date());
		user.setLastUpdatedBy("biswa");
		user.setLastUpdatedDate(new Date());
		
		List<Address> addr=new ArrayList<Address>();

		Address address1=new Address();
		address1.setAddressLine1("A1001,pramuk aqua heights");
		address1.setAddressLine2("Electronic city");
		address1.setCity("Bengaluru");
		address1.setState("karnataka");
		address1.setZipCode("560100");
		address1.setAddressType("residence");
		
		Address address2=new Address();
		address2.setAddressLine1("SRS Solution");
		address2.setAddressLine2("kormangala");
		address2.setCity("Bengaluru");
		address2.setState("karnataka");
		address2.setZipCode("560103");
		address2.setAddressType("office");
		
		addr.add(address1);
		addr.add(address2);
		
		user.setAddresses(addr);
		
		user.setCredential(credential);
		credential.setUser(user);
		session.persist(user);
		session.flush();
		
		
		
		//-------------------Second Transaction ---------------------------
		Account account=new Account();
		account.setCreatedBy("biswa");
		account.setCreatedDate(new Date());
		account.setCurrentBalance(new BigDecimal(80000000));
		account.setInitialBalance(new BigDecimal(80000000));
		account.setName("saving account");
		account.setLastUpdatedBy("biswa");
		account.setOpenDate(new Date());
		account.setLastUpdatedDate(new Date());
		account.getUsers().add(user);
		
		Transaction transaction1=new Transaction();
		transaction1.setAccount(account);
		transaction1.setAmount(new BigDecimal(30000));
		transaction1.setClosingBalance(new BigDecimal(300000));
		transaction1.setInitialBalance(new BigDecimal(300000));
		transaction1.setCreatedBy("biswa");
		transaction1.setCreatedDate(new Date());
		transaction1.setNotes("test");
		transaction1.setTitle("mobile purchase");
		transaction1.setTransactionType("personal");
		transaction1.setLastUpdatedBy("biswa");
		transaction1.setLastUpdatedDate(new Date());
		account.getTransactions().add(transaction1);
		user.getAccounts().add(account);
		
		session.persist(account);
		//-------------------third Transaction ---------------------------
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
		account.setBank(bank);
		bank.getContacts().put("Manager", "Biswajit");
		bank.getContacts().put("deputy manager", "sarvanan");
		
		session.persist(bank);
		session.getTransaction().commit();
		session.close();
	
		
		System.exit(1);
		
	}

}
