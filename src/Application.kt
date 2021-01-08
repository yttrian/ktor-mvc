package me.ianmooreis

import io.ktor.application.*
import io.ktor.routing.*
import me.ianmooreis.web.clock.ClockController
import me.ianmooreis.web.index.IndexController
import me.ianmooreis.web.mvc.route
import me.ianmooreis.web.random.RandomController

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    routing {
        route("/", IndexController)
        route("/clock", ClockController)
        route("/random", RandomController(12345))
    }
}
