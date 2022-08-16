package com.yaakovmargalit.myrestfullapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restFull {
    @GetMapping
    public String hello(){
        return "hello";
    }
}
