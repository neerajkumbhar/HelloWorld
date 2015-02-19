package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.{RequestMapping, RestController, ResponseBody}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMethod



/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */
@RestController
//@Controller
//@ResponseBody
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {
  
   //@RequestMapping(Array("/"))
   @RequestMapping(value=Array("/"),method=Array(RequestMethod.GET))
   def mapResponse() = "Hello world. This is a demo application showing the successful execution of Scala + Spring Boot"
   
   //@RequestMapping(Array("/head"),method=Array(RequestMethod.HEAD))
   //def head() = "Hello world."
   
   
  
   
  
}
