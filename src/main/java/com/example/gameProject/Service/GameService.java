package com.example.gameProject.Service;

import com.example.gameProject.Model.Game;
import com.example.gameProject.ModelAPI.CreateBoardRequest;
import com.example.gameProject.ModelAPI.GameUpdateRequest;

public interface GameService {
     String gameInfo() throws Exception;
     String gameStatus(String gameID) throws Exception;
     Game createGame();
     Game updateGame(GameUpdateRequest gameUpdateRequest, String gameID) throws Exception;
     Game joinGame(String gameID, String playerID) throws Exception;
     void setBoard(String gameID, CreateBoardRequest createBoardRequest) throws Exception;
}
