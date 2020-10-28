package io.tohure.assistant.sync

import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class SyncController {

    val endpoint = "https://gturnquist-quoters.cfapps.io/api/random"

    @Autowired
    lateinit var restTemplate : RestTemplate

    @Autowired
    lateinit var log: Logger

    @GetMapping("/demo")
    fun printDemo(@RequestParam(value = "name", defaultValue = "Tohure") name: String) : Demo {
       return Demo(name, 7)
    }

    @GetMapping("/sync")
    fun printRestDemo(): DemoQuote? {

        val quote = restTemplate.getForObject(endpoint, DemoQuote::class.java)

        log.info(quote.toString())

        return quote
    }
}