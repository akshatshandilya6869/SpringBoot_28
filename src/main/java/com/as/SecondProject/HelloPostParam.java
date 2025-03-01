package com.as.SecondProject;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloPostParam {
    @PostMapping("/hello/post")
    public String sayHello(@RequestBody UserDTOBean user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}