package poly.edu.duy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/report")
public class ReportController {

    // TODO Giai đoạn 6: inject ReportService

    @GetMapping("/revenue")
    public String revenueByRoute(Model model) {
        // TODO: dùng DTO/Projection + GROUP BY, SUM, COUNT, AVG, MAX, MIN
        return "admin/report/revenue";
    }

    @GetMapping("/top-customers")
    public String topCustomers(Model model) {
        // TODO: top 10 khách hàng
        return "admin/report/top-customers";
    }

    @GetMapping("/operator-performance")
    public String operatorPerformance(Model model) {
        // TODO: hiệu quả nhân viên
        return "admin/report/operator-performance";
    }
}