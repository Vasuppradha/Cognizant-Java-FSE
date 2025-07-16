package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request, HttpServletResponse response) {
        LOGGER.info("START - sayHello()");

        // --- HTTP Request Details ---
        LOGGER.info("Method: {}", request.getMethod());
        LOGGER.info("Request URI: {}", request.getRequestURI());
        LOGGER.info("Protocol: {}", request.getProtocol());
        LOGGER.info("User-Agent: {}", request.getHeader("User-Agent"));

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            LOGGER.info("Header: {} = {}", header, request.getHeader(header));
        }

        // --- HTTP Response Header ---
        response.setHeader("X-Custom-Header", "This is a custom response header");

        LOGGER.info("END - sayHello()");
        return "Hello World!!";
    }
}
