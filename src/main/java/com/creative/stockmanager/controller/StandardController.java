package com.creative.stockmanager.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StandardController {

    @RequestMapping("/")
    String home() {
        return "It works !";
    }


}