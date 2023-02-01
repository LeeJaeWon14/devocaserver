package com.jeepchief.devocaserver

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("/api")
class DevocaController {
//    @GetMapping("/")
//    fun test(model: Model) : String {
//        model["title"] = "Blog"
//        return "blog"
//    }

    @GetMapping("/")
    fun showIndex() : String = "index"

    @GetMapping("/test")
    @ResponseBody
    fun getTest() : String = "TEST"

    @GetMapping("/welcome")
    fun getWelcome(model: Model) : String {
//        model["message"] = "Hi.. it's just test api"
        model.addAttribute("message", "Hi.. it's just test api")
        return "welcome"
    }

}