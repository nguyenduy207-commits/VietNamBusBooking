package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({ "/", "/home/index" })
	public String Home(Model model) {
		model.addAttribute("msg", "Chào mừng bạn đến với Việt Nam Bus Booking!");
		return "home/index";
	}

	@GetMapping("/home/about")
	public String About(Model model) {
		model.addAttribute("title", "Giới thiệu");
		return "home/about";
	}

	@GetMapping("/home/help")
	public String Help(Model model) {
		model.addAttribute("title", "Trợ giúp");
		return "home/help";
	}
}
