package com.example.gameProject.Model;

import lombok.Data;

import java.util.List;

@Data
public class PlayerTarget {
    String targetName;
    List<TargetPosition> targetPosition;
}
