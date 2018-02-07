package io.pivotal.example.restcallscheduled

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableScheduling
class RestCallScheduledApplication {

    @Bean
    fun restTemplate() = RestTemplate()

}

fun main(args: Array<String>) {
    SpringApplication.run(RestCallScheduledApplication::class.java, *args)
}
