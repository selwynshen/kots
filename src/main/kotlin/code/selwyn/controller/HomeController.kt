package code.selwyn.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by Selwyn on 5/22/2017.
 */
@Controller
open class HomeController{

    @RequestMapping(value="/")
    fun index(): String = "redirect:/login"

    @RequestMapping(value="/index")
    fun homepage(): String = "index"
}