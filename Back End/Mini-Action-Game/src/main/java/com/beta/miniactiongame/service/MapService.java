package com.beta.miniactiongame.service;


import com.beta.miniactiongame.model.map.Map;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MapService {

    public Map createMap() {
        return new Map(40, 19);
    }
}