package io.tohure.assistant.corutines

import kotlinx.coroutines.delay
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class GitHubLookupService {

    @Autowired
    lateinit var restTemplate : RestTemplate

    suspend fun findUser(): GitHubUser? {
        logger.info("Looking up ...")
        val url = "https://api.github.com/users/tohure"
        val results = restTemplate.getForObject(url, GitHubUser::class.java)
        // Artificial delay of 1s for demonstration purposes
        delay(3000)
        return results
    }

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(GitHubLookupService::class.java)
    }

}