package com.example.gameProject.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PlayerAttack {
    String targetedPlayer;
    Coordinates targets;

}
