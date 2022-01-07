package com.example.route.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Map {

    static Map instance = null;
    private HashMap<String, Country> countries;

    private Map() {
        this.countries = new HashMap<>();
    }

    public static Map getInstance() {
        if (instance == null) {
            instance = new Map();
        }
        return instance;
    }

}
