package redcompa.project.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redcompa.project.models.entities.Chat;
import redcompa.project.models.entities.Message;
import redcompa.project.models.entities.Status;
import redcompa.project.models.entities.UserModel;
import redcompa.project.models.repositories.IChatRepository;
import redcompa.project.models.repositories.IMessageRepository;

@Service
public class ChatService {
	@Autowired
	IChatRepository repository;
	
	
	@Autowired
    private IMessageRepository messageRepository;

    public void sendMessage(Long chatId, String messageContent) {
        Optional<Chat> optionalChat = repository.findById(chatId);
        if (optionalChat.isPresent()) {
            Chat chat = optionalChat.get();
            Message message = new Message();
            message.setChat(chat);
            message.setContent(messageContent);
            // Aquí puedes configurar otros atributos del mensaje, como el usuario que lo envía, la fecha, etc.
            messageRepository.save(message);
        } else {
            // Manejo de errores si no se encuentra el chat con el ID proporcionado
        }
    }
	
	public List<Chat> findAll(){
		return this.repository.findAll();
		
	}
	public Chat findByStatus(Status status) {
		return this.findByStatus(status);
	}
	public Chat findByUsers(UserModel user) {
		return this.repository.findByUsers(user);
	}
	
	
	public Chat findById(Long id) {
		return this.repository.findById(id).orElse(null);
	}
	
	public Chat save(Chat reaction) {
		return this.repository.save(reaction);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	
	
	

}
