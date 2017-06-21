package org.biswajit.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.biswajit.data.entities.EpUser;
import org.biswajit.service.EpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


@Path("/EpUser")
public class Users {

/*	@Autowired
	EpUserService service;*/

	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	EpUserService service=context.getBean(EpUserService.class);

	//WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(servlet.getServletContext());
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userId}")
	public EpUser getUserById(@PathParam("userId")  Long userId){
		EpUser epuser=null;
		
		System.out.println("user id :" +userId);

		try{
			if(service !=null){
				System.out.println("Service is not null "+service);
				epuser=service.getEpUser(userId);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return epuser;
	}

}
