package com.snhu.weather;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

    @GetMapping("/weather")
    public String weather(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        model.addAttribute("name", name);
        return "weather";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}