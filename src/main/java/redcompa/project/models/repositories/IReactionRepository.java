package redcompa.project.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import redcompa.project.models.entities.Reaction;
import redcompa.project.models.entities.Status;
import redcompa.project.models.entities.UserModel;

public interface IReactionRepository extends JpaRepository<Reaction, Long> {
	public List<Reaction> findAll();
	
	public Reaction findByStatus(Status status);

	public Reaction findByUser(UserModel user);

}
