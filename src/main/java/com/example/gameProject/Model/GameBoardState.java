package com.example.gameProject.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GameBoardState {
    String playerID;
    List<PlayerTarget> playerTargets = new ArrayList<>();
    List<PlayerAttack> playerAttacks = new ArrayList<>();
}
