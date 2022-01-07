package com.example.route.service.impl;

import com.example.route.model.Map;
import com.example.route.model.Route;
import com.example.route.service.RouteService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Stack;

@Service
public class RouteServiceImpl implements RouteService {

    @Override
    @Cacheable(value = "routeCache",
            key = "{ #root.methodName, #origin, #destination }")
    public Route findRoute(String origin, String destination) {
        Map map = Map.getInstance();
        Route route = new Route();
        if (!this.isRouteValid(map, origin, destination)) {
            return route;
        }
        Stack<String> path = new Stack<>();
        HashMap<String, Boolean> discovered = new HashMap<>();
        this.isReachable(map, origin, destination, path, discovered);
        route.setRoute(path);
        return route;
    }

    private Boolean isReachable(Map map, String origin, String destination, Stack<String> path, HashMap<String, Boolean> discovered) {
        discovered.put(origin, true);
        path.add(origin);
        if (origin.equals(destination)) {
            return true;
        }
        for (String u : map.getCountries().get(origin).getBorders()) {
            if (!discovered.getOrDefault(u, false)) {
                if (isReachable(map, u, destination, path, discovered)) {
                    return true;
                }
            }
        }
        path.pop();
        return false;
    }

    private Boolean isRouteValid(Map map, String origin, String destination) {
        return map.getCountries().getOrDefault(origin, null) != null && map.getCountries().getOrDefault(destination, null) != null;
    }


}

