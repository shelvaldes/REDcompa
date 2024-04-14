package redcompa.project.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import redcompa.project.models.entities.Response;
import redcompa.project.models.entities.UserModel;
import redcompa.project.models.services.ResponseService;
import redcompa.project.models.services.StatusService;
import redcompa.project.models.services.UserService;

@Controller
@RequestMapping("/status")
public class StatusController {
	

	@Autowired
	StatusService statusService;
	@Autowired
	ResponseService responseService;
	@Autowired
	UserService userService;
	
	@GetMapping({"/"})
	public String list(Model model) {
		//Authentication auth
		//User userService.findById(auth.user.getId());
		
		//In this case i'll choose the id user
		UserModel user = userService.findById(1L);
		model.addAttribute("statuses",statusService.findByUser(user));
		model.addAttribute("response", new Response( LocalDate.now()));
		
		
		return "/views/status";
	}
	
	
	@GetMapping({"/addResponse"})
	public String addResponse(@RequestParam("response") Response response,Model model) {
		//Authentication auth
		//User userService.findById(auth.user.getId());
		System.out.println(response);
		//In this case i'll choose the id user
		UserModel user = userService.findById(1L);
		//responseService.save(response)
		model.addAttribute("statuses",statusService.findByUser(user));
		
		
		return "/views/status";
	}
	
	

}
