package com.snhu.weather;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWeatherController {
    
    @RequestMapping("/test")
    public String test() {
        return "test string output";
    }
}
