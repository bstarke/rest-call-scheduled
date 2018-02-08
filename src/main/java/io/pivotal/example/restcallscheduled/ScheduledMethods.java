package io.pivotal.example.restcallscheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledMethods {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    private final RestTemplate restTemplate;
    @Value("${rest.url}")
    private String restUrl;


    public ScheduledMethods(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Scheduled(cron = "${cron.job.schedule}")
    public void makeRestCall() {
        String response = restTemplate.getForObject(restUrl, String.class);
        LOG.debug(response);
    }
}
