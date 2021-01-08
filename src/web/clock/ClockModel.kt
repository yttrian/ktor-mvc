package me.ianmooreis.web.clock

import me.ianmooreis.web.mvc.Model
import java.time.LocalDateTime

data class ClockModel(val time: LocalDateTime) : Model