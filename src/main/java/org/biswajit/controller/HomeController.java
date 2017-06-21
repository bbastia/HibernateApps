package org.biswajit.controller;

import java.util.List;

import org.biswajit.data.entities.EpUser;
import org.biswajit.service.EpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	@Autowired
	EpUserService service;
	
	@RequestMapping("/")
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="EpUser/{epUserId}" ,method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<EpUser> getEpUser(@PathVariable("epUserId")  Long epUserId){
	 EpUser epuser=null;
				
				try{
					epuser=service.getEpUser(epUserId);
				}catch (Exception e) {
					
				}
				return new ResponseEntity<EpUser>(epuser, HttpStatus.OK);
	}
	
	@RequestMapping(value= "EpUser/all", method = RequestMethod.GET)
	public ResponseEntity<List<EpUser>> getAllPersons() {
		List<EpUser> list = service.getAllEpUser();
		return new ResponseEntity<List<EpUser>>(list, HttpStatus.OK);
	}
}
