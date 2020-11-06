package com.example.SimpleWeb

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
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
    fun getInfo(model: Model):String{
        model.addAttribute("student",Student("Przemysław","Stokłosa"))
        model.addAttribute("name","Przemysław")
        model.addAttribute("array",IntArray(10){it*it})
        return "index"
    }

}
