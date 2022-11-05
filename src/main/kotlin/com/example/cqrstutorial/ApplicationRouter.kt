package com.example.cqrstutorial

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class ApplicationRouter(
    private val sensingDataHandler: SensingDataHandler,
) {
    @Bean
    fun routes(): RouterFunction<ServerResponse> =
        coRouter {
            "/api".nest {
                accept(APPLICATION_JSON).nest {
                    "sensing-data".nest {
                        GET("", sensingDataHandler::test)
                        POST("", sensingDataHandler::register)
                    }
                }
            }
        }
}
