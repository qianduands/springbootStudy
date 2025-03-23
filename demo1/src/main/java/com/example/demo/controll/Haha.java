package com.example.demo.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Haha {
    @GetMapping("/ya")
    public String haha(){
        return "hahah";
    }
}
