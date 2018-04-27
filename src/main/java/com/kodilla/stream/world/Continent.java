package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {
    private Set<Country> countrySet;

    public Continent() {
        this.countrySet = new HashSet<>();
    }

    public void addCountryToSet(Country country) {
        countrySet.add(country);
    }

    public Set<Country> getCountrySet() {
        return new HashSet<>(countrySet);
    }
}
