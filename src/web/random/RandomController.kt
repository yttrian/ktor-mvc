package me.ianmooreis.web.random

import io.ktor.routing.*
import me.ianmooreis.web.mvc.Controller
import kotlin.random.Random

class RandomController(seed: Int) : Controller<RandomModel>(RandomView) {
    private val random = Random(seed)

    override fun Route.routes() {
        get {
            context.respondView(RandomModel(random.nextInt()))
        }
    }
}