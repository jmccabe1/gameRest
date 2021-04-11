package com.example.gameProject.Service;


import com.example.gameProject.Helper.GameHelper;
import com.example.gameProject.Model.Game;
import com.example.gameProject.ModelAPI.GameUpdateRequest;
import com.example.gameProject.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameServiceIMPL implements GameService{
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private GameHelper gameHelper;

    @Override
    public String gameInfo() throws Exception {
        return gameHelper.getGame("606bd26be43685d583c36871").getGameStatus();
    }

    @Override
    public String gameStatus(String gameID) throws Exception {
        return gameHelper.getGame(gameID).getGameStatus();
    }

    @Override
    public Game createGame() {
        Game newGame = new Game();
        newGame.setGameStatus("ONLINE");
        newGame.setPlayers(new ArrayList<>());
        newGame.getPlayers().add("Jesus");
        return gameRepository.save(newGame);
    }

    @Override
    public Game updateGame(GameUpdateRequest gameUpdateRequest, String gameID) throws Exception {
        if (gameUpdateRequest.getGameStatus() == null) {
            return gameHelper.getGame(gameID);
        }
        Game workableGame = gameHelper.getGame(gameID);
        workableGame.setGameStatus(gameUpdateRequest.getGameStatus());
        return gameRepository.save(workableGame);
    }

    @Override
    public Game joinGame(String gameID, String playerID) throws Exception {
        if (!gameHelper.getGame(gameID).getPlayers().contains(playerID)) {
            Game workableGame = gameHelper.getGame(gameID);
            workableGame.getPlayers().add(playerID);
            return gameRepository.save(workableGame);
        }
        return null;
    }
}
