package me.ianmooreis.web.clock

import io.ktor.routing.*
import me.ianmooreis.web.mvc.Controller
import java.time.LocalDateTime

object ClockController : Controller<ClockModel>(ClockView) {
    override fun Route.routes() {
        get {
            context.respondView(ClockModel(LocalDateTime.now()))
        }
    }
}