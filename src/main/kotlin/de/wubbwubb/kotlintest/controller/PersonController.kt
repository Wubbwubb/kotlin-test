package de.wubbwubb.kotlintest.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@Controller
class PersonController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Person Page"
        model["message"] = "You are the master brain at " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)
        model["time"] = ZonedDateTime.now()
        return "person"
    }

}
