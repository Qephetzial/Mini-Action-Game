package com.beta.miniactiongame.model.map;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
public class Map {
    private final int width;
    private final int height;
    private List<List<String>> map;

    private final Random random = new Random();
    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        map = new ArrayList<>();
        for (int x = 0; x < width; x++) {
            List<String> cells = new ArrayList<>();
            for (int y = 0; y < height; y++) {
                if (random.nextInt(100) < 7) {
                    cells.add("R");
                } else if (random.nextInt(100) < 7) {
                    cells.add("W");
                } else {
                    cells.add("G");
                }
            }
            map.add(cells);
        }
    }
}
