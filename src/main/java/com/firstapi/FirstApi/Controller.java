package com.firstapi.FirstApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api")
    public String msg(){
        return "Hello Dude!";
    }
}
