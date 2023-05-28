package com.snhu.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestWeatherController {
    
    @RequestMapping("/test")
    public String test() {
        return "test string output";
    }

    @GetMapping(value = "/callclienthello")
    private String getHelloClient() {
        String uri = "http://localhost:8080/test";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping(value = "/scryfall")
    private String getScryfallRandom() {
        String uri = "https://api.scryfall.com/cards/random";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    //TODO: make this accept query parameters
    @GetMapping(value = "/weather/points")
    private String getPointsByCoordinates() {
        String uri = "https://api.weather.gov/points/35,-82";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    public String hitFromElsewhere() {
        return "You're looking at RestWeatherController";
    }
}
