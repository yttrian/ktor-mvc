package me.ianmooreis.web.random

import me.ianmooreis.web.mvc.LayoutTemplate
import me.ianmooreis.web.mvc.View

object RandomView : View<RandomModel> {
    override fun LayoutTemplate.apply(model: RandomModel) {
        content {
            articleTitle { +"Random" }
            articleText { +"${model.number}" }
        }
    }
}