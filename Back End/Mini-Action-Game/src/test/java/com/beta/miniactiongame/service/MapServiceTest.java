package com.beta.miniactiongame.service;

import com.beta.miniactiongame.model.map.Map;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MapServiceTest {

    private final MapService mapService = new MapService();

    @Test
    void createMap() {
        Map map = mapService.createMap();
        System.out.println(map.getMap());
    }
}