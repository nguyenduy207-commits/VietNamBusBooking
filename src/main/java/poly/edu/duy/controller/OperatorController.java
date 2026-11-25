package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/operator/schedule")
public class OperatorController {
    @GetMapping
    public String schedule(Model model) {
        // TODO: load các chuyến được phân công cho consultant
        return "operator/schedule";
    }

    @GetMapping("/{tripId}")
    public String tripDetail(@PathVariable("tripId") Integer tripId, Model model) {
        // TODO: kiểm tra chuyến thuộc phạm vi phân công
        return "operator/trip-detail";
    }

    @PostMapping("/{tripId}/status")
    public String updateStatus(@PathVariable("tripId") Integer tripId,
                               @RequestParam("status") String status) {
        // TODO: cập nhật trạng thái chuyến
        return "redirect:/operator/schedule";
    }
}
