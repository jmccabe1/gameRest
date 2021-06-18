package com.example.gameProject.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class GameID {
    @Id
    String gameID;
}
