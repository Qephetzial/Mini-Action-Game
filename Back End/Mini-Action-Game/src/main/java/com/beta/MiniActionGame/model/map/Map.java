package com.beta.MiniActionGame.model.map;

public class Map {
    private final Cell[][] cells;

    public Map(int height, int width, Cell[][] cells) {
        this.cells = cells;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new Cell(x, y);
            }
        }
    }
}
