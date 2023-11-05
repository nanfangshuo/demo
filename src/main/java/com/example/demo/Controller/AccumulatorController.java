package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AccumulatorController {
    private int totalScore = 0;

    @GetMapping("/acc")
    public int accumulateScore(@RequestParam int para) {
        totalScore += para;
        return totalScore;
    }
}
