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

    @RequestMapping(value = "/hello")
    public String hello() {
        return "helloworld";
    }

    //Example greeting endpoint with query parameters
    //http://localhost:8080/greeting?name=hola
    @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

    //http://localhost:8080/weatherresults?latitude=34&longitude=-80
    @GetMapping("/weatherresults")
	public String weatherresults(
        @RequestParam(name="latitude", required=false, defaultValue="-82") String latitude,
        @RequestParam(name="longitude", required=false, defaultValue="35") String longitude,
        Model model) {
        model.addAttribute("latitude", latitude);
		model.addAttribute("longitude", longitude);

		return "weatherresults";
	}

}