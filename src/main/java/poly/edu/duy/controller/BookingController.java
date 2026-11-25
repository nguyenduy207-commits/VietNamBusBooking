package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/booking")
public class BookingController {
    @GetMapping("/checkout")
    public String checkout(Model model) {
        // TODO: đọc cart, kiểm tra đăng nhập, kiểm tra ghế
        return "booking/checkout";
    }

    @PostMapping("/checkout")
    public String doCheckout(@RequestParam("note") String note) {
        // TODO: validate, tạo Booking + BookingDetail + Payment trong transaction
        return "redirect:/booking/my-tickets";
    }

    @GetMapping("/list")
    public String list(Model model) {
        // TODO: load danh sách booking của account đang đăng nhập
        return "booking/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        // TODO: kiểm tra quyền sở hữu, load chi tiết
        return "booking/detail";
    }

    @GetMapping("/cancel/{id}")
    public String cancel(@PathVariable("id") Integer id) {
        // TODO: kiểm tra quy định hủy vé phía server, cập nhật trạng thái
        return "redirect:/booking/list";
    }

    @GetMapping("/my-tickets")
    public String myTickets(Model model) {
        // TODO: load tất cả vé của account
        return "booking/my-tickets";
    }
}
