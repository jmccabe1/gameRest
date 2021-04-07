package com.example.gameProject.Service;


import com.example.gameProject.Helper.GameHelper;
import com.example.gameProject.Repository.GameRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceIMPL implements GameService{
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private GameHelper gameHelper;

    @Override
    public String gameInfo() {
        return gameHelper.getGame("606bd26be43685d583c36871").gameStatus;
    }

    @Override
    public String gameStatus() {
        return "Get Game Status";
    }

    @Override
    public String createGame() {
        return "Create Game";
    }

    @Override
    public String startGame() {
        return "Start Game, Make Your First Move";
    }
}
