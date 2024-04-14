package redcompa.project.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redcompa.project.models.entities.Response;
import redcompa.project.models.entities.Status;
import redcompa.project.models.repositories.IResponseRepository;

@Service
public class ResponseService {
	@Autowired
	IResponseRepository repository;
	
	public List<Response> findAll(){
		return this.repository.findAll();
		
	}
	public Response findByStatus(Status status) {
		return this.findByStatus(status);
	}
	public Response findByContent(String content) {
		return this.repository.findByContentContaining(content);
	}
	
	public Response save(Response response) {
		return this.repository.save(response);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	

}
