package com.example.SimpleWeb

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
class SimpleController {
    @RequestMapping("")
    @ResponseBody
    fun getHome():String{
        return "Strona główna"
    }
    @RequestMapping("index")
    fun getInfo():String{
        return "index"
    }

}
