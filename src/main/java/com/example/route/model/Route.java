package com.example.route.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Stack;

@Getter
@Setter
public class Route {

    private Stack<String> route;

    public Route() {
        this.route = new Stack<>();
    }

}
