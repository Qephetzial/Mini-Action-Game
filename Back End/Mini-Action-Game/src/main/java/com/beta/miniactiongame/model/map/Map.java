package com.beta.miniactiongame.model.map;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.beta.miniactiongame.util.UtilityMethods.getRandomInt;

@Getter
public class Map {
    private final int width;
    private final int height;
    private final List<List<String>> gameMap;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        gameMap = new ArrayList<>();
        for (int x = 0; x < width; x++) {
            List<String> cells = new ArrayList<>();
            for (int y = 0; y < height; y++) {
                if (getRandomInt(100) < 10) {
                    cells.add("R");
                } else if (getRandomInt(100) < 5) {
                    cells.add("W");
                } else {
                    cells.add("G");
                }
            }
            gameMap.add(cells);
        }
    }
}
