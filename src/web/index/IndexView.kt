package me.ianmooreis.web.index

import kotlinx.html.a
import kotlinx.html.li
import kotlinx.html.ul
import me.ianmooreis.web.mvc.LayoutTemplate
import me.ianmooreis.web.mvc.Model
import me.ianmooreis.web.mvc.View

object IndexView : View<Model.Empty> {
    override fun LayoutTemplate.apply(model: Model.Empty) {
        content {
            articleTitle { +"Ktor MVC" }
            articleText {
                ul {
                    li { a("/clock") { +"Clock" } }
                    li { a("/random") { +"Random" } }
                }
            }
        }
    }
}