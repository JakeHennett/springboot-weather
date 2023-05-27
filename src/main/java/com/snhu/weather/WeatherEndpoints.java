package com.snhu.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class WeatherEndpoints {

    @Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			// MTGCard randomCard = restTemplate.getForObject(
			// 		"https://api.scryfall.com/cards/random", MTGCard.class);
			// log.info(randomCard.toString());
		};
	}
    
}
