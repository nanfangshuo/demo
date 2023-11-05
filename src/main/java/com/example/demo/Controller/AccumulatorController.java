package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccumulatorController {

    private int totalScore = 0; // 初始累计分数

    @GetMapping("/acc")
    public String getAccumulatorPage(@RequestParam int para, Model model) {
        totalScore += para;
        model.addAttribute("totalScore", totalScore);
        return "accumulator";
    }
}

