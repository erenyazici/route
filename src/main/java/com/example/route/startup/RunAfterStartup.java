package com.example.route.startup;

import com.example.route.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RunAfterStartup {

    private final MapService mapService;

    @EventListener(ApplicationReadyEvent.class)
    public void loadData() throws Exception {
        this.mapService.loadCountries();
    }
}
