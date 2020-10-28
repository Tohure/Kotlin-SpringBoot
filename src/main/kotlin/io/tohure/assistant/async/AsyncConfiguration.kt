package io.tohure.assistant.async

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import java.util.concurrent.Executor

@Configuration
@EnableAsync
class AsyncConfiguration {

    @Bean(name = ["asyncExecutor"])
    fun taskExecutor(): Executor? {
        return ThreadPoolTaskExecutor().apply {
            corePoolSize = 2
            maxPoolSize = 2
            setQueueCapacity(500)
            setThreadNamePrefix("GithubLookup-")
            initialize()
        }
    }
}