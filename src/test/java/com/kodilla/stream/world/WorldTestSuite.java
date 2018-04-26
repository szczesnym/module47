package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent tempContinet = new Continent();
        tempContinet.addCountryToSet(new Country(new BigDecimal("1111")));
        tempContinet.addCountryToSet(new Country(new BigDecimal("2222")));
        tempContinet.addCountryToSet(new Country(new BigDecimal("3333")));

        Continent tempContinet2 = new Continent();
        tempContinet.addCountryToSet(new Country(new BigDecimal("4444")));
        tempContinet.addCountryToSet(new Country(new BigDecimal("5555")));
        tempContinet.addCountryToSet(new Country(new BigDecimal("6666")));

        World sutWorld = new World();
        sutWorld.addContinentToSet(tempContinet);
        sutWorld.addContinentToSet(tempContinet2);
        //When
        BigDecimal testResult = sutWorld.getPeopleQuantity();
        //Then
        Assert.assertTrue(testResult.equals(new BigDecimal("23331")));
    }
}
