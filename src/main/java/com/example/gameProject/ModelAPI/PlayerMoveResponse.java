package com.example.gameProject.ModelAPI;


import lombok.Data;

@Data
public class PlayerMoveResponse {
    private boolean wasHit;
    private boolean haveYouWon;
}
