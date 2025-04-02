package com.universidad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo_RestController {
    
    @GetMapping("/saludo/{name}")
    public String Saludos(@PathVariable String name) {
        name = "Angel";
        return "Saludos " + name;
    }
}