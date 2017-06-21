package org.biswajit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.biswajit.Repository.EpUserRepository;
import org.biswajit.data.entities.EpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service("service")
public class EpUserService {

	@Autowired
	EpUserRepository repo;
	
	public EpUser getEpUser(Long id){
		return repo.getEpUserById(id);
	}
	
	public void createEpUser(EpUser epUser){
		repo.createUser(epUser);
		System.out.println(" User Created Successfully");
		
	}
	
	public void deleteEpUser(EpUser epUser){
		repo.deleteUser(epUser);
		System.out.println(" User deleted Successfully");
	}
	
	public void updateEpUser(EpUser epUser){
		repo.updateUser(epUser);
		System.out.println(" User Updated Successfully");
	}
	public List<EpUser> getAllEpUser(){
		return repo.getAll();
	
	}
}
