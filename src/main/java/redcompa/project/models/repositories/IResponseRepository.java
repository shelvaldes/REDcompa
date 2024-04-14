package redcompa.project.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import redcompa.project.models.entities.Response;
import redcompa.project.models.entities.Status;
import redcompa.project.models.entities.UserModel;

public interface IResponseRepository extends JpaRepository<Response, Long> {
	public List<Response> findAll();

	public Response findByContentContaining(String content);
	
	public Response findByStatus(Status status);

	public Response findByUser(UserModel user);

}
