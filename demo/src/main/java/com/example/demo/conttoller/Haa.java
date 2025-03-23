package com.example.demo.conttoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Haa {
    @GetMapping("/haa")
    public String haa(){
        return "haha";
    }
}
