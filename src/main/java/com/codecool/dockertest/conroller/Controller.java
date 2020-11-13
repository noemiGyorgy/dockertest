package com.codecool.dockertest.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller {

    @GetMapping("/greeting")
    public  String sayHello() {
        return "Hello Docker!";
    }
}