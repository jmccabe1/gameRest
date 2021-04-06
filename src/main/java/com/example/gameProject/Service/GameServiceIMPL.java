package com.example.gameProject.Service;


import com.example.gameProject.Repository.GameRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceIMPL implements GameService{
    @Autowired
    private GameRepository gameRepository;

    @Override
    public String gameInfo() {
        ObjectId id = new ObjectId("606bd26be43685d583c36871");
        return gameRepository.findBy_id(id).gameStatus;
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
