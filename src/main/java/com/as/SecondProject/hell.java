package com.as.SecondProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hell {
    @GetMapping("akshat")
    public String hi(){
        return "hi";
    }
}
