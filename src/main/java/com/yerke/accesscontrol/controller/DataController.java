package com.yerke.accesscontrol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/private-data")
    public String privateData() {
        return "Private Data";
    }

    @GetMapping("/public-data")
    public String publicData() {
        return "Public Data";
    }
}