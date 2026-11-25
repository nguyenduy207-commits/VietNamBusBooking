package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/account")
public class AccountAdminController {

    // TODO Giai đoạn 5: inject AccountService

    @GetMapping("/index")
    public String index(@RequestParam(value = "page", defaultValue = "0") int page,
                        @RequestParam(value = "q", required = false) String q,
                        @RequestParam(value = "role", required = false) String role,
                        Model model) {
        return "admin/account/index";
    }

    @GetMapping("/toggle/{id}")
    public String toggleActive(@PathVariable("id") Integer id) {
        // TODO: khóa/mở khóa, không xem mật khẩu
        return "redirect:/admin/account/index";
    }
}
