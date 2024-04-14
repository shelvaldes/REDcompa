package redcompa.project.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redcompa.project.models.entities.Reaction;
import redcompa.project.models.entities.Status;
import redcompa.project.models.entities.UserModel;
import redcompa.project.models.repositories.IReactionRepository;

@Service
public class ReactionService {
	@Autowired
	IReactionRepository repository;
	
	public List<Reaction> findAll(){
		return this.repository.findAll();
		
	}
	public Reaction findByStatus(Status status) {
		return this.findByStatus(status);
	}
	public Reaction findByContent(UserModel user) {
		return this.repository.findByUser(user);
	}
	
	public Reaction save(Reaction reaction) {
		return this.repository.save(reaction);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	

}
