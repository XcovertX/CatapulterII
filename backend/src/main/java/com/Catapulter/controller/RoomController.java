package com.Catapulter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.game.Game;
import com.world.*;

@RestController
public class RoomController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/room")
    public GameRoom getMap() {
        System.out.println("Game.currentRoom: ");
        System.out.println(Game.currentRoom);
        return Game.currentRoom;
    }
}
