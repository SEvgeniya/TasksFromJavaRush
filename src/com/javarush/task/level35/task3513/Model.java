package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles ;
    int score;
    int maxTile;
    public Model() {
        resetGameTiles();
    }
    private void addTile() {
        List<Tile> list = getEmptyTiles();
        if (list!=null&&list.size()!=0) {
            list.get((int) (list.size() * Math.random())).setValue(Math.random() < 0.9 ? 2 : 4);
        }
    }
    private List<Tile> getEmptyTiles() {
        List<Tile> result = new ArrayList<>();
        for (int i = 0; i < FIELD_WIDTH; i ++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                if (gameTiles[i][j].value == 0) {
                    result.add(gameTiles[i][j]);
                }
            }
        }
        return result;
    }
    void resetGameTiles() {
        this.gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < this.gameTiles.length; i ++) {
            for (int j = 0; j < this.gameTiles.length; j ++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }
    private void compressTiles(Tile[] tiles) {

    }
    private void mergeTiles(Tile[] tiles) {

    }
}
