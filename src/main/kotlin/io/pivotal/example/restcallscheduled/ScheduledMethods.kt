package io.pivotal.example.restcallscheduled

import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ScheduledMethods(private val restTemplate: RestTemplate) {

    @Value("\${rest.url}")
    lateinit var restUrl: String

    @Scheduled(cron = "\${cron.job.schedule}")
    fun makeRestCall() {
        val response = restTemplate.getForObject(restUrl, String::class.java)
        println(response)
    }
}
