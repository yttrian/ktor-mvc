package me.ianmooreis.web.mvc

import io.ktor.application.*
import io.ktor.html.*
import io.ktor.routing.*

abstract class Controller<in M : Model>(private val view: View<M>) {
    abstract fun Route.routes()

    operator fun invoke(route: Route) = with(route) { routes() }

    suspend fun ApplicationCall.respondView(model: M) = this.respondHtmlTemplate(LayoutTemplate()) {
        with(view) { apply(model) }
    }
}

fun <M : Model> Route.route(path: String, controller: Controller<M>) = controller(createRouteFromPath(path))
