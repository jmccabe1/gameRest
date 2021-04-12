package com.example.gameProject.ModelAPI;

import com.example.gameProject.Model.PlayerTarget;
import lombok.Data;

import java.util.List;


@Data
public class CreateBoardRequest {
    String playerID;
    List<PlayerTarget> playerTargets;
}
