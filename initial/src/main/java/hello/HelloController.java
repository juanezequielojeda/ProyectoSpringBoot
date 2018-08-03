package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/sal")
    public String sal() {
    	return "Saludo 2";
    }
    
    @RequestMapping("/submenu")
    public String submenu() {
    	
    	return "Saludo submenu";
    }
}
