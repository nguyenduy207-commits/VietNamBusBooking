package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/trip")
public class TripAdminController {

    // TODO Giai đoạn 5: inject TripService, BusService, RouteService, OperatorService

    @GetMapping("/index")
    public String index(@RequestParam(value = "page", defaultValue = "0") int page,
                        Model model) {
        return "admin/trip/index";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        return "admin/trip/form";
    }

    @PostMapping("/save")
    public String save() {
        // TODO: kiểm tra trùng giờ/xe
        return "redirect:/admin/trip/index";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") Integer id, Model model) {
        return "admin/trip/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        return "redirect:/admin/trip/index";
    }
}