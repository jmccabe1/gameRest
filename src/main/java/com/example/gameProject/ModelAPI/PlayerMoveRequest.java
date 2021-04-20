package com.example.gameProject.ModelAPI;


import com.example.gameProject.Model.Coordinates;
import lombok.Data;

@Data
public class PlayerMoveRequest {
    private String attackingPlayerID;
    private String defendingPlayerID;
    private Coordinates target;
}
