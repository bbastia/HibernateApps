package org.biswajit.Test;

import java.util.Date;

import org.biswajit.data.entities.EpUser;
import org.biswajit.data.entities.EstAuditData;
import org.biswajit.data.entities.EstUserLocation;
import org.biswajit.service.EpUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EpUserTest {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");

		
		EpUserService service=context.getBean(EpUserService.class);
		

				
				
		//EpUser epUser1=service.getEpUser(44080l);
		
		//System.out.println(epUser1);
		
		EpUser epUser=new EpUser();
		epUser.setFirstName("rajesh");
		epUser.setLastName("singh");
		epUser.setAutoScreenName("rajesh");
		epUser.setContactEmail("rajesh@cisco.com");
		epUser.setIsActive(true);
		
		EstAuditData data=new EstAuditData();
		data.setCreatedByUserId(44080l);
		data.setCreatedDate(new Date());
		data.setLastModifiedDate(new Date());
		epUser.setAuditData(data);
		epUser.setLiferayUserId(15935l);
		epUser.setPassword("W6ph5Mm5Pz8GgiULbPgzG37mj9g=");
		epUser.setScreenName("rajesh");
		epUser.setTenantId(10154l);
		EstUserLocation location=new EstUserLocation();
		location.setCity("bangalore");
		location.setCountry("india");
		location.setPhoneNum("8017230667");
		location.setTheatre(1);
		epUser.setUserLocation(location);
		epUser.setAutoScreenName("rajesh");
		service.createEpUser(epUser);
		
	//EpUser epuser1=service.getEpUser(49414l);
	//	service.deleteEpUser(epuser1);
		
		
	}
}
