package com.chapter6.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloworldController {

    //Hello Worldを表示
    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World";
    }

    //こんにちは!!!!!!を表示
    @GetMapping("/helloJapanese")
    public String helloJapanese() {
        return "こんにちは!!!!!!";
    }

    //numberを表示
    @GetMapping("/number")
    public Integer number() {
        return 123456;
    }

    //Listの中身を表示
    @GetMapping("/names")
    public List<String> names() {
        List<String> names = List.of("ohtani", "yoshida", "senga");
        return names;
    }

    //Nameクラスを表示
    @GetMapping("/names2")
    public Name names2() {
        return new Name("shohei", "ohtani", 29);
    }

    //Nameクラスを表示2
    @GetMapping("/names3")
    public Name names3() {
        Name name = new Name("masataka", "yoshida", 30);
        return name;
    }
}
