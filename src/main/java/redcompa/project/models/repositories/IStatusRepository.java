package redcompa.project.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import redcompa.project.models.entities.Status;
import redcompa.project.models.entities.UserModel;

public interface IStatusRepository extends JpaRepository<Status, Long> {
	public List<Status> findAll();

	public Status findByContentContaining(String content);

	public List<Status> findByUsermOrderByCreationDate(UserModel user);

}
