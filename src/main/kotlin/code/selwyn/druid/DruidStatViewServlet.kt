package code.selwyn.druid

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;
/**
 * Created by Selwyn on 5/22/2017.
 */

@WebServlet(urlPatterns = arrayOf("/druid/*"),
        initParams= arrayOf(
            WebInitParam(name="loginUsername", value="selwyn"),
            WebInitParam(name="loginPassword", value="selwyn331")
        ))
open class DruidStatViewServlet constructor(): StatViewServlet(){

}