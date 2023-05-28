package com.snhu.weather;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;

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

    //http://localhost:8080/weatherresults?longitude=34&latitude=-80
    @GetMapping("/weatherresults")
	public String weatherresults(
        @RequestParam(name="longitude", required=false, defaultValue="35") String longitude,
        @RequestParam(name="latitude", required=false, defaultValue="-82") String latitude,
        Model model) {
		model.addAttribute("longitude", longitude);
		model.addAttribute("latitude", latitude);
        //boilerplate

        //do business logic here
        
        //Test this later to see if longitude and latitude provide dynamic results
        String buildPointsURI = "https://api.weather.gov/points/" + longitude + "," + latitude;
        String pointsURI = "https://api.weather.gov/points/35,-82";
        RestTemplate restTemplate = new RestTemplate();
        Point pointsResult = restTemplate.getForObject(pointsURI, Point.class);
        //return pointsResult.toString();





        //return results
        //this needs to return an html path. how can we pass contents to the path?
		return "weatherresults";
	}

}