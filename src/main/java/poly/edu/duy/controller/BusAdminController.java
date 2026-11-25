package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/bus")
public class BusAdminController {

	// TODO Giai đoạn 5: inject BusService, BusSeatService, BusOperatorService

	@GetMapping("/index")
	public String index(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
		return "admin/bus/index";
	}

	@GetMapping("/create")
	public String createForm(Model model) {
		return "admin/bus/form";
	}

	@PostMapping("/save")
	public String save() {
		// TODO: validate license plate unique, tạo ghế theo capacity
		return "redirect:/admin/bus/index";
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Integer id, Model model) {
		return "admin/bus/form";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		return "redirect:/admin/bus/index";
	}
}