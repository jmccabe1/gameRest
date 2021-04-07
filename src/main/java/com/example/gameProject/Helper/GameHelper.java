package com.example.gameProject.Helper;

import com.example.gameProject.Model.Game;
import com.example.gameProject.Repository.GameRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class GameHelper {
    @Autowired
    private GameRepository gameRepository;

    public Game getGame(String gameID) throws Exception {
        if (gameID == null) {
            throw new Exception("No ID entered");
        }
        ObjectId id = new ObjectId(gameID);
        Game ourGame = gameRepository.findBy_id(id);
        return ourGame;
    }
}
