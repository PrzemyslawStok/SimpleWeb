package com.example.SimpleWeb

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
class SimpleController {
    var array = 2

    @RequestMapping("")
    fun getHome(model: Model):String{
        model.addAttribute("autor",Student("Przemysław","Stokłosa"))
        return "home"
    }
    @RequestMapping("index")
    fun getInfo(model: Model):String{
        model.addAttribute("student",Student("Przemysław","Stokłosa"))
        model.addAttribute("name","Przemysław")
        model.addAttribute("array",IntArray(10){it*it})
        return "index"
    }

    @RequestMapping("tablica")
    @ResponseBody
    fun getArray():IntArray{
        return IntArray(100){it}
    }

    @RequestMapping("tablicahtml")
    fun getArrayHtml(model: Model):String{
        model.addAttribute("array",IntArray(100){it})
        return "array"
    }


}
