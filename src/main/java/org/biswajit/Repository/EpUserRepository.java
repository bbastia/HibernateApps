package org.biswajit.Repository;

import java.util.List;

import org.biswajit.data.entities.EpUser;
import org.springframework.stereotype.Repository;

@Repository
public interface EpUserRepository {

	public EpUser getEpUserById(Long id);
	
	public void createUser(EpUser epUser);
	
	public void deleteUser(EpUser eUser);
	
	public void updateUser(EpUser eUser);
	
	public List<EpUser> getAll();
}
