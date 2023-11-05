package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping("/sum1")
    public String sumFromParams(@RequestParam int a, @RequestParam int b, Model model) {
        int sum = a + b;
        model.addAttribute("result", a + " + " + b + " = " + sum);
        return "result";
    }

    @GetMapping("/sum12/{a}/{b}")
    public String sumFromPath(@PathVariable int a, @PathVariable int b, Model model) {
        int sum = a + b;
        model.addAttribute("result", a + " + " + b + " = " + sum);
        return "result";
    }
}


