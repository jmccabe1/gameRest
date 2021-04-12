package com.example.gameProject.Model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "gameInstances")
public class Game {
    @Id
    private ObjectId _id;
    private List<String> players;
    private String gameStatus;
    List<GameBoardState> boardSetup;
}
