package io.pivotal.example.restcallscheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
class RestCallScheduledApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

