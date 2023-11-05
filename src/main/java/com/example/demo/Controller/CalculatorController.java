package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    @GetMapping("/sum1")
    public int sumFromParams(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/sum12/{a}/{b}")
    public int sumFromPath(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
}

