package com.example.route.api.controller;

import com.example.route.model.Route;
import com.example.route.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RouteController {

    private final RouteService routeService;

    @GetMapping(value = "/routing/{origin}/{destination}", produces = {"application/json"})
    public ResponseEntity<Route> findRoute(@PathVariable("origin") String origin, @PathVariable("destination") String destination) {
        Route route = this.routeService.findRoute(origin, destination);
        if (route.getRoute().size() > 0) {
            return new ResponseEntity<>(route, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
