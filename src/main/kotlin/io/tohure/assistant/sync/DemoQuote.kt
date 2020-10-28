package io.tohure.assistant.sync

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class DemoQuote(
    var type: String = "",
    var value: Value? = null
) {

    data class Value(
        var id: Int = -1,
        var quote: String = ""
    )
}