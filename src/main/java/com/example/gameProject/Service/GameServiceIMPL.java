package com.example.gameProject.Service;


import com.example.gameProject.Helper.GameHelper;
import com.example.gameProject.Model.Game;
import com.example.gameProject.ModelAPI.GameUpdateRequest;
import com.example.gameProject.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceIMPL implements GameService{
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private GameHelper gameHelper;

    @Override
    public String gameInfo() throws Exception {
        return gameHelper.getGame("606bd26be43685d583c36871").gameStatus;
    }

    @Override
    public String gameStatus(String gameID) throws Exception {
        return gameHelper.getGame(gameID).gameStatus;
    }

    @Override
    public Game createGame() {
        Game newGame = new Game();
        return gameRepository.save(newGame);
    }

    @Override
    public Game updateGame(GameUpdateRequest gameUpdateRequest, String gameID) throws Exception {
        if (gameUpdateRequest.getGameStatus() == null) {
            return gameHelper.getGame(gameID);
        }
        Game workableGame = gameHelper.getGame(gameID);
        workableGame.gameStatus = gameUpdateRequest.getGameStatus();
        return gameRepository.save(workableGame);
    }
}
