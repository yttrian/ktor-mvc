package me.ianmooreis

import io.ktor.application.*
import io.ktor.routing.*
import me.ianmooreis.web.clock.ClockController
import me.ianmooreis.web.mvc.Controller
import me.ianmooreis.web.mvc.Model
import me.ianmooreis.web.mvc.route

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {
        route("/", ClockController)
    }
}

