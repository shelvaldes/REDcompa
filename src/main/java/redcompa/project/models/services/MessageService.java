package redcompa.project.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redcompa.project.models.entities.Message;
import redcompa.project.models.entities.Status;
import redcompa.project.models.repositories.IMessageRepository;

@Service
public class MessageService {
	@Autowired
	IMessageRepository repository;
	
	public List<Message> findAll(){
		return this.repository.findAll();
		
	}
	public Message findByStatus(Status status) {
		return this.findByStatus(status);
	}

	
	public Message save(Message reaction) {
		return this.repository.save(reaction);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	

}
