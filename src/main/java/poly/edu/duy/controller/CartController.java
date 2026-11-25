package poly.edu.duy.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CartController {
	@GetMapping("/cart/index")
	public String index() {
		return "cart/index";
	}

	@GetMapping("/add/{tripId}")
    public String add(@PathVariable("tripId") Integer tripId,
                      @RequestParam("seatIds") String seatIds) {
        return "redirect:/cart/index";
    }


	@GetMapping("/cart/remove/{tripId}")
	public String remove(@PathVariable String tripId) {
		return "redirect:/cart/index";
	}

	 @PostMapping("/update")
	    public String update(@RequestParam("tripId") Integer tripId,
	                         @RequestParam("seatIds") String seatIds) {
	        return "redirect:/cart/index";
	    }

	@GetMapping("/cart/clear")
	public String clear() {
		return "redirect:/cart/index";
	}

	@ResponseBody
	@GetMapping("/cart/info")
	public Object getInfo() {
		return Map.of("count", 5, "amount", 250);
	}
}
