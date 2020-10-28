package io.tohure.assistant.corutines

import kotlinx.coroutines.coroutineScope
import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CoroutineController {

    @Autowired
    lateinit var gitHubLookupService: GitHubLookupService

    @Autowired
    lateinit var log: Logger

    @GetMapping("/coroutine")
    suspend fun printCorouDemo(): GitHubUser? = coroutineScope {
        log.info("Llamada coroutine")
        return@coroutineScope gitHubLookupService.findUser()
    }
}