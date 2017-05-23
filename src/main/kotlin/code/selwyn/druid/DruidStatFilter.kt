package code.selwyn.druid

import com.alibaba.druid.support.http.WebStatFilter
import javax.servlet.annotation.WebFilter
import javax.servlet.annotation.WebInitParam

/**
 * Created by Selwyn on 5/22/2017.
 */

@WebFilter(filterName="druidWebStatFilter",urlPatterns=arrayOf("/*"),
        initParams=arrayOf(
            WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        ))
open class DruidStatFilter constructor() : WebStatFilter(){

}