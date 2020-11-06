package com.example.SimpleWeb

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("")
    fun getHome():String{
        return "Strona główna"
    }
    @RequestMapping("info")
    fun getInfo():String{
        return "info"
    }

}
