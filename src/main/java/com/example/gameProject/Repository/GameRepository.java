package com.example.gameProject.Repository;

import com.example.gameProject.Model.Game;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameRepository extends MongoRepository<Game, String> {
    Game findBy_id(ObjectId _id);
}
