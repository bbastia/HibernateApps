package org.biswajit.Test;

import org.biswajit.data.entities.EpUser;
import org.biswajit.service.EpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpUserController {
	
	@Autowired
	EpUserService service;
	
	@GetMapping("/epUser/{id}")
	public ResponseEntity getCustomer(@PathVariable("id") Long id) {

		EpUser epUser = service.getEpUser(id);
		if (epUser == null) {
			return new ResponseEntity("No User found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(epUser, HttpStatus.OK);
	}

}
