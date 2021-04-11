package com.example.gameProject;


import com.example.gameProject.Model.Game;
import com.example.gameProject.ModelAPI.GameUpdateRequest;
import com.example.gameProject.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @Autowired
    GameService gameService;

    @GetMapping("/api/v1/game/{gameID}")
    public String gameInfo(@PathVariable("gameID") String gameID) throws Exception {
        return gameService.gameInfo();
    }

    @GetMapping("/api/v1/game/{gameID}/status")
    public String gameStatus(@PathVariable("gameID") String gameID) throws Exception {
        return gameService.gameStatus(gameID);
    }


    @PostMapping("/api/v1/game")
    public Game createGame(){
        return gameService.createGame();
    }

    @PutMapping("/api/v1/game/{gameID}")
    public Game updateGame(@PathVariable("gameID") String gameID,
    @RequestBody GameUpdateRequest gameUpdateRequest) throws Exception {
        return gameService.updateGame(gameUpdateRequest, gameID);
    }

}
