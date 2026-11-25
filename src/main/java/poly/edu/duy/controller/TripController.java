package poly.edu.duy.controller;

import java.math.BigDecimal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class TripController {
    @GetMapping("/index")
    public String index(
            @RequestParam(value = "dep", required = false) String dep,
            @RequestParam(value = "arr", required = false) String arr,
            @RequestParam(value = "date", required = false) String date,
            @RequestParam(value = "passengers", required = false, defaultValue = "1") Integer passengers,
            @RequestParam(value = "minPrice", required = false) BigDecimal minPrice,
            @RequestParam(value = "maxPrice", required = false) BigDecimal maxPrice,
            @RequestParam(value = "operator", required = false) Integer operatorId,
            @RequestParam(value = "busType", required = false) String busType,
            @RequestParam(value = "sort", required = false) String sort,
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            Model model) {
        return "trip/index";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        // TODO: load Trip + sơ đồ ghế + chuyến tương tự
        return "trip/detail";
    }
}
