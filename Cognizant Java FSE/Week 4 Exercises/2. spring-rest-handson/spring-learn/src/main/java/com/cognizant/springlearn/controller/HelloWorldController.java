package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello-world")
    public String sayHelloWorld() {
        LOGGER.info("START - sayHelloWorld()");
        String message = "Hello World!!";
        LOGGER.info("END - sayHelloWorld()");
        return message;
    }
}
