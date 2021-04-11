package com.example.gameProject.Service;

import com.example.gameProject.Model.Game;
import com.example.gameProject.ModelAPI.GameUpdateRequest;

public interface GameService {
    public String gameInfo() throws Exception;
    public String gameStatus(String gameID) throws Exception;
    public Game createGame();
    public Game updateGame(GameUpdateRequest gameUpdateRequest, String gameID) throws Exception;
}
