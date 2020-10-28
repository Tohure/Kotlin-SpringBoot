package io.tohure.assistant

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class DemoSpringKotlinApplication {

	private val log: Logger = LoggerFactory.getLogger(DemoSpringKotlinApplication::class.java)

	@Bean
	fun getRestTemplate() = RestTemplate()

	@Bean
	fun getLogger() = log

}

fun main(args: Array<String>) {
    runApplication<DemoSpringKotlinApplication>(*args)
}
