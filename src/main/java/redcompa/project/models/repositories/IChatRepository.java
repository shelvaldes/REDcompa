package redcompa.project.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import redcompa.project.models.entities.Chat;
import redcompa.project.models.entities.UserModel;

public interface IChatRepository extends JpaRepository<Chat, Long> {
	public List<Chat> findAll();
	
	
	public Chat findByUsers(UserModel user);

}
