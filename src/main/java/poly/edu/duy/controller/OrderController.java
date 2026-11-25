package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import poly.edu.duy.entity.Order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/order")
public class OrderController {
	@GetMapping("/checkout")
	public String checkoutForm() {
		return "order/checkout";
	}
	@PostMapping("/checkout")
	public String checkoutSave(Order order) {
		return "redict:/order/detail" + order.getId();
	}
	@GetMapping("/detail/{id}")
	public String detail() {
		return "order/detail";
	}
	@GetMapping("/cancel")
	public String cancel(@PathVariable String id) {
		return "redict:/order/list";
	}
	@GetMapping("/list")
	public String list(@PathVariable String id) {
		return "order/list";
	}
	
	
}
