package code.selwyn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
@ServletComponentScan
open class Application constructor() : SpringBootServletInitializer()


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

