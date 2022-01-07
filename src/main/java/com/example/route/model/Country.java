package com.example.route.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    private String cca3;
    private List<String> borders;

    public Country(String cca3) {
        this.cca3 = cca3;
        this.borders = new ArrayList<>();
    }

}
