package io.tohure.assistant.async

import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AsyncController {

    @Autowired
    lateinit var gitHubLookupService: GitHubLookupService

    @Autowired
    lateinit var log: Logger

    @GetMapping("/async")
    fun printAsyncDemo(): GitHubUser? {
        log.info("Llamada async")
        return gitHubLookupService.findUser().get()
    }
}