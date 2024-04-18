package com.Catapulter.controller;

import com.game.GameLoop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class GameLoopTestController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/gameLoopTest")
    public String GameLoopUpdateReport() {
        String x = GameLoop.updateTime + " seconds.";
        return x;
    }
}

