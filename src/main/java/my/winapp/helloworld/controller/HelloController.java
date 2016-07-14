package my.winapp.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	//can be accessed via http://localhost:8080/
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
