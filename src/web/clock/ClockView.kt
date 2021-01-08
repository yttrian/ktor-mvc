package me.ianmooreis.web.clock

import io.ktor.http.*
import me.ianmooreis.web.mvc.LayoutTemplate
import me.ianmooreis.web.mvc.View

object ClockView : View<ClockModel> {
    override fun LayoutTemplate.apply(model: ClockModel) {
        content {
            articleTitle { +"Clock" }
            articleText { +model.time.toHttpDateString() }
        }
    }
}