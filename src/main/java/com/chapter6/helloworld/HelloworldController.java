package com.chapter6.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloworldController {


    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World";
    }
}
