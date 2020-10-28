package io.tohure.assistant.corutines

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GitHubUser(
    var company: String = "",
    var name: String = "",
    var twitter_username: String = ""
)