package code.selwyn.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.servlet.http.HttpServletRequest

/**
 * Created by Selwyn on 6/5/2017.
 */
@RestController
open class TestController{

    @RequestMapping(value="/test/ip")
    fun ip(request: HttpServletRequest): Map<String, Any?> {
        var ip1: String? = request.getHeader("x-forwarded-for")
        var ip2: String? = request.getRemoteAddr()
        var ip3: String? = request.getHeader("Proxy-Client-IP")

        return mapOf("forwarded-ip" to ip1, "ip" to ip2, "proxy-ip" to ip3)

    }
}