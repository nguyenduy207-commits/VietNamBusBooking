package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/route")
public class RouteAdminController {

	// TODO Giai đoạn 5: inject BusRouteService, BusCategoryService

	@GetMapping("/index")
	public String index(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "q", required = false) String q, Model model) {
		return "admin/route/index";
	}

	@GetMapping("/create")
	public String createForm(Model model) {
		return "admin/route/form";
	}

	@PostMapping("/save")
	public String save() {
		return "redirect:/admin/route/index";
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Integer id, Model model) {
		return "admin/route/form";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		return "redirect:/admin/route/index";
	}

	@GetMapping("/toggle/{id}")
	public String toggle(@PathVariable("id") Integer id) {
		return "redirect:/admin/route/index";
	}
}
