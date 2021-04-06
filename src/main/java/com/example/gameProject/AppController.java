package com.example.gameProject;


import com.example.gameProject.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @Autowired
    GameService gameService;

    @GetMapping("/api/v1/game/{gameID}")
    public String gameInfo(@PathVariable("gameID") String gameID){
        return gameService.gameInfo();
    }

    @GetMapping("/api/v1/game/{gameID}/status")
    public String gameStatus(@PathVariable("gameID") String gameID){
        return gameService.gameStatus();
    }


    @PostMapping("/api/v1/game")
    public String createGame(){
        return gameService.createGame();
    }

    @PutMapping("/api/v1/game/{gameID}")
    public String startGame(@PathVariable("gameID") String gameID){
        return gameService.startGame();
    }

}
