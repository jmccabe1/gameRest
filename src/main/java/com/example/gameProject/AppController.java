package com.example.gameProject;


import com.example.gameProject.Model.Game;
import com.example.gameProject.Model.GameID;
import com.example.gameProject.ModelAPI.*;
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

    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping("/api/v1/game")
    public GameID createGame(
            @RequestBody CreateGameRequest createGameRequest) throws Exception
     {
        return gameService.createGame(createGameRequest);
    }

    @PutMapping("/api/v1/game/{gameID}")
    public Game updateGame(@PathVariable("gameID") String gameID,
                           @RequestBody GameUpdateRequest gameUpdateRequest) throws Exception {
        return gameService.updateGame(gameUpdateRequest, gameID);
    }

    @PutMapping("/api/v1/game/{gameID}/join")
    public Game joinGame(@PathVariable("gameID") String gameID,
                         @RequestBody String playerID) throws Exception {
        return gameService.joinGame(gameID, playerID);
    }

    @PostMapping("/api/v1/game/{gameID}/board")
    public void setBoard(@PathVariable("gameID") String gameID,
                         @RequestBody CreateBoardRequest createBoardRequest) throws Exception {
        gameService.setBoard(gameID, createBoardRequest);
    }

    @PutMapping("/api/v1/game/{gameID}/board")
    public PlayerMoveResponse playerMove(@PathVariable("gameID") String gameID,
            @RequestBody PlayerMoveRequest playerMoveRequest) throws Exception {
        return gameService.playerMove(gameID, playerMoveRequest);
    }
}
