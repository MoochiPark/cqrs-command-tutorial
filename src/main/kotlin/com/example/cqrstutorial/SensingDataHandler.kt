package com.example.cqrstutorial

import java.net.URI
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.created
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.awaitBody
import org.springframework.web.reactive.function.server.buildAndAwait

@Component
class SensingDataHandler(
    private val sensingDataRepository: SensingDataRepository,
) {
    suspend fun test(request: ServerRequest): ServerResponse {
        return ok().buildAndAwait()
    }

    suspend fun register(request: ServerRequest): ServerResponse =
        request.awaitBody<SensingData>().run {
            sensingDataRepository.insert(this).let {
                created(URI.create("/sensing-data/${it.id}"))
                    .buildAndAwait()
            }
        }
}
