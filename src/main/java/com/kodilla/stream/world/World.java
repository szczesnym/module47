package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    Set<Continent> continentSet;

    public World() {
        continentSet = new HashSet<>();
    }

    BigDecimal getPeopleQuantity() {
        BigDecimal resultPeopleQuantity = continentSet.stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sumOfWorld, countryCount) -> sumOfWorld = sumOfWorld.add(countryCount));
        return resultPeopleQuantity;
    }

    public void addContinentToSet(Continent continent) {
        this.continentSet.add(continent);
    }
}
