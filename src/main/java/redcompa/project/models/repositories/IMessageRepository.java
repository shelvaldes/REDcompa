package redcompa.project.models.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import redcompa.project.models.entities.Chat;
import redcompa.project.models.entities.Message;
import redcompa.project.models.entities.UserModel;

public interface IMessageRepository extends JpaRepository<Message, Long> {
	public List<Message> findAll();
	
	
	public Chat findByUser(UserModel user);

}
