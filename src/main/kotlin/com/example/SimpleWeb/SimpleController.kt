package com.example.SimpleWeb

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class SimpleController {
    final var tab = mutableListOf<Int>()

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
    fun getArray():MutableList<Int>{
        return tab
    }

    @RequestMapping("tablicahtml")
    fun getArrayHtml(model: Model):String{
        model.addAttribute("array",tab)
        return "array"
    }

    @RequestMapping("addnumber")
    fun addNumber(@RequestParam("number") number: Int){
        tab.add(number)
    }

    init{
        tab.addAll(IntArray(100){it}.asList())
    }

}
