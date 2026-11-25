package poly.edu.duy.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import poly.edu.duy.entity.User;

@Controller
@RequestMapping("/auth")
public class AuthController {
	@GetMapping("/login")
	public String loginForm() {
		return "account/login";
	}

	@PostMapping("/login")
	public String loginCheck(@RequestParam String username, @RequestParam String password,
			@RequestParam Optional<Boolean> remember) {
		return "account/login";
	}

	@GetMapping("/logout")
	public String logout() {
		return "redict:/account/login";
	}

	@GetMapping("/sign-up")
	public String signUpForm() {
		return "acount/sign-up";
	}

	@PostMapping("/sign-up")
	public String signUpSave(User user) {
		return "account/sign-up";
	}

	@GetMapping("/active/{username}")
	public String activate(@PathVariable String username) {
		return "redict:/acount/login";
	}

	@GetMapping("/forgot-password")
	public String forgotPasswordForm() {
		return "acount/forgot-password";
	}

	@PostMapping("/forgot-password")
	public String forgotPasswordFind(@RequestParam String email) {
		return "redict:/account/login";
	}

	@GetMapping("/change-password")
	public String changePasswordForm() {
		return "acount/change-password";
	}

	@PostMapping("/change-password")
	public String changePasswordFind(@RequestParam String username, @RequestParam String password,
			@RequestParam String newpass, @RequestParam String confirm) {
		return "redict:/account/login";
	}
}
