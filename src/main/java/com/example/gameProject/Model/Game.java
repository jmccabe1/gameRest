package com.example.gameProject.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "gameInstances")
public class Game {
    @Id
    public ObjectId _id;

    public String gameStatus;

}
