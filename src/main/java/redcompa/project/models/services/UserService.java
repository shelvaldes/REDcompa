package redcompa.project.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redcompa.project.models.entities.UserModel;
import redcompa.project.models.repositories.IUserRepository;

@Service
public class UserService {
	@Autowired
	IUserRepository repository;
	
	public List<UserModel> findAll(){
		return this.repository.findAll();
	}
	public UserModel findByName(String name) {
		return this.repository.findByName(name);
	}
	
	public UserModel findById(Long id) {
		return this.repository.findById(id).orElse(null);
	}
	
	public UserModel save(UserModel user) {
		return this.repository.save(user);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	

}
