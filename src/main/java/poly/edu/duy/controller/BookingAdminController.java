package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/booking")
public class BookingAdminController {

    // TODO Giai đoạn 5: inject BookingService

    @GetMapping("/index")
    public String index(@RequestParam(value = "page", defaultValue = "0") int page,
                        @RequestParam(value = "status", required = false) String status,
                        @RequestParam(value = "from", required = false) String from,
                        @RequestParam(value = "to", required = false) String to,
                        Model model) {
        return "admin/booking/index";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        return "admin/booking/detail";
    }

    @PostMapping("/update-status/{id}")
    public String updateStatus(@PathVariable("id") Integer id,
                               @RequestParam("status") String status) {
        // TODO: validate theo quy tắc nghiệp vụ
        return "redirect:/admin/booking/index";
    }
}