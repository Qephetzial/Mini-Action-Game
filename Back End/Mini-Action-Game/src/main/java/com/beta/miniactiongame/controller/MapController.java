package com.beta.miniactiongame.controller;

import com.beta.miniactiongame.model.map.Map;
import com.beta.miniactiongame.service.MapService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/map")
public class MapController {

    private final MapService mapService;

    @GetMapping
    public Map getMap() {
        return mapService.createMap();
    }
}