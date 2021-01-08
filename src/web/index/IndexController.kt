package me.ianmooreis.web.index

import io.ktor.routing.*
import me.ianmooreis.web.mvc.Controller
import me.ianmooreis.web.mvc.Model

object IndexController : Controller<Model.Empty>(IndexView) {
    override fun Route.routes() {
        get {
            context.respondView(Model.Empty)
        }
    }
}
