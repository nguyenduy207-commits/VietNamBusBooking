package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	@GetMapping("/product/list")
	public String list() {
		return "product/list";
	}
	@GetMapping("/product/detail/{id}")
	public String detail(@PathVariable String id) {
		return "product/detail";
	}
	
}
