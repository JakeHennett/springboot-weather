package com.snhu.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    //http://localhost:8080/weather/points/31/-82
    @GetMapping(value = "/weather/points/{longitude}/{latitude}")
    private String getPointsByCoordinates(@PathVariable Long longitude, @PathVariable Long latitude) {
        String uri = "https://api.weather.gov/points/" + longitude + "," + latitude;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    //Below paths are copied from the quotes example
    //https://github.com/spring-guides/quoters/blob/master/src/main/java/org/springframework/quoters/QuoteController.java
    
	// @GetMapping("/api")
	// public List<QuoteResource> getAll() {

	// 	return repository.findAll().stream()
	// 		.map(quote -> new QuoteResource(quote, "success"))
	// 		.collect(Collectors.toList());
	// }

	// @GetMapping("/api/{id}")
	// public QuoteResource getOne(@PathVariable Long id) {

	// 	return repository.findById(id)
	// 		.map(quote -> new QuoteResource(quote, "success"))
	// 		.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	// }

	// @GetMapping("/api/random")
	// public QuoteResource getRandomOne() {
	// 	return getOne(nextLong(1, repository.count() + 1));
	// }

	// private long nextLong(long lowerRange, long upperRange) {
	// 	return (long) (RANDOMIZER.nextDouble() * (upperRange - lowerRange)) + lowerRange;
	// }

}
