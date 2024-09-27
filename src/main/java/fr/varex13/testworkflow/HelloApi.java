package fr.varex13.testworkflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloApi {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
