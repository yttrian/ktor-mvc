package me.ianmooreis.web.mvc

interface View<in T : Model> {
    fun LayoutTemplate.apply(model: T)
}