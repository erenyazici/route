package com.example.route.service.impl;

import com.example.route.model.Country;
import com.example.route.model.Map;
import com.example.route.service.MapService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MapServiceImpl implements MapService {

    @Value("${countryFile.path}")
    private String countryFilePath;


    @Override
    public void loadCountries() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        List<Country> countryList;
        countryList = objectMapper.readValue(new File(countryFilePath), new TypeReference<>() {
        });

        Map map = Map.getInstance();
        countryList.forEach(e -> map.getCountries().put(e.getCca3(), e));

    }

}
