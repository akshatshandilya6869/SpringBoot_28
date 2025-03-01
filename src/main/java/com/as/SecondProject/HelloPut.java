package com.as.SecondProject;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloPut {
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}