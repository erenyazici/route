package com.example.route.service;

import com.example.route.model.Route;

public interface RouteService {

    Route findRoute(String origin, String destination);

}
