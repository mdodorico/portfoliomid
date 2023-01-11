package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import web.model.Contact;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String mostrarHome() {
		return "home";
	}
	
	@GetMapping("/about")
	public String aboutMe() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact(Contact message, Model model) {
		model.addAttribute("message", message);
		return "contact";
	}
	
	@GetMapping("/portfolio")
	public String portfolio() {
		return "portfolio";
	}
	
	@GetMapping("/cv")
	public String cv() {
		return "cv";
	}
}
