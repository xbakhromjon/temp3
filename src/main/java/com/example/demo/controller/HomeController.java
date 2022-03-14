package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bakhromjon Mon, 7:24 PM 3/14/2022
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "Welcome to rest controller";
    }

}
