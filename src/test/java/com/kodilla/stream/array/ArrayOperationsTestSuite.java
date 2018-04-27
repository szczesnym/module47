package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testArrayAvg() {
        //Given
        int[] sutTabOfInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        //When
        double testResult = ArrayOperations.getAverage(sutTabOfInt);
        //Then
        Assert.assertEquals(5.6, testResult, 0.01);
    }
}
