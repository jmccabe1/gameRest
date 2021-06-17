package com.example.gameProject.Service;

import com.example.gameProject.Model.Game;
import com.example.gameProject.ModelAPI.*;

public interface GameService {
     String gameInfo() throws Exception;
     String gameStatus(String gameID) throws Exception;
     Game createGame(CreateGameRequest createGameRequest);
     Game updateGame(GameUpdateRequest gameUpdateRequest, String gameID) throws Exception;
     Game joinGame(String gameID, String playerID) throws Exception;
     void setBoard(String gameID, CreateBoardRequest createBoardRequest) throws Exception;
     PlayerMoveResponse playerMove(String gameID, PlayerMoveRequest playerMoveRequest) throws Exception;

}
