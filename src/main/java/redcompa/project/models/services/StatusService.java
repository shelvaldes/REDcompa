package redcompa.project.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redcompa.project.models.entities.Status;
import redcompa.project.models.entities.UserModel;
import redcompa.project.models.repositories.IStatusRepository;

@Service
public class StatusService {
	@Autowired
	IStatusRepository repository;
	
	public List<Status> findAll(){
		return this.repository.findAll();
	}
	public Status findByContent(String content) {
		return this.repository.findByContentContaining(content);
	}
	
	public List<Status> findByUser(UserModel user) {
		return this.repository.findByUsermOrderByCreationDate(user);
	}
	
	public Status save(Status status) {
		return this.repository.save(status);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	

}
