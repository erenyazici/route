package com.example.route;

import com.example.route.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class RouteApplication {

    private final MapService mapService;

    public static void main(String[] args) {
        SpringApplication.run(RouteApplication.class, args);
    }

}
