package poly.edu.duy.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import poly.edu.duy.entity.User;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/acount")
public class AccountController {
	@GetMapping("/profile")
	public String profile(Model model) {
		return "account/profile";
	}

	@PostMapping("/profile")
	public String updateProfile() {
		return "redict:/account/profile";
	}
	@PostMapping("/change-password")
	public String changePasswordFind(@RequestParam String username, @RequestParam String password,
			@RequestParam String newpass, @RequestParam String confirm) {
		return "redict:/account/login";
	}

}
