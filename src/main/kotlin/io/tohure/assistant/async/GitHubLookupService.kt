package io.tohure.assistant.async

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.concurrent.CompletableFuture

@Service
class GitHubLookupService(restTemplateBuilder: RestTemplateBuilder) {
    var restTemplate: RestTemplate = restTemplateBuilder.build()

    @Async("asyncExecutor")
    @Throws(InterruptedException::class)
    fun findUser(): CompletableFuture<GitHubUser?> {
        logger.info("Looking up ...")
        val url = "https://api.github.com/users/tohure"
        val results = restTemplate.getForObject(url, GitHubUser::class.java)
        // Artificial delay of 1s for demonstration purposes
        Thread.sleep(3000)
        return CompletableFuture.completedFuture(results)
    }

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(GitHubLookupService::class.java)
    }

}