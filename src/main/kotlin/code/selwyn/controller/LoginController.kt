package code.selwyn.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by Selwyn on 5/22/2017.
 */
@Controller
open class LoginController{

    @RequestMapping(value="login", method = arrayOf(RequestMethod.GET))
    fun login(): String = "login"
}