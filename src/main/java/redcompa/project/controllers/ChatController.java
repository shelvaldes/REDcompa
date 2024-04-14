package redcompa.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import redcompa.project.models.services.ChatService;

@Controller
@RequestMapping("/chat")
public class ChatController {

	@Autowired
	private ChatService chatService;

	@GetMapping("/")
	public String chatPage(Model model) {
		// Aquí puedes inicializar el modelo con los datos necesarios para la vista
		model.addAttribute("chat", chatService);
		return "/views/chat"; // Devuelve el nombre de la vista
	}
	
	@PostMapping("/send-message")
    @ResponseBody
    public String sendMessageToChat(@RequestParam("chatId") Long chatId, 
                                    @RequestParam("messageContent") String messageContent) {
        chatService.sendMessage(chatId, messageContent);
        return "Message sent successfully!";
    }

/*	@PostMapping("/send")
	public String sendMessage(@RequestParam("message") String message) {
		// Procesa el mensaje enviado por el usuario
		//chatService.processMessage(message);
		// Redirige a la página de chat actualizada
		return "redirect:/chat/";
	}*/

}
