package com.example.demo.web;

import com.example.demo.model.entity.City;
import com.example.demo.services.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * created by yanming on 2018/7/31
 */
@Controller
public class IndexController {
    @Autowired
    CityServices cityServices;
    /**
     * index page
     * http://localhost:8080/city/Bahia
     */
    @RequestMapping("/{district}")
    public String index(Model model, @PathVariable String district) {
        List<City> cities = cityServices.getCityListByDistrict(district == null ? "New South Wales" : district);
        model.addAttribute("cities", cities);

        return "index";
    }
}
