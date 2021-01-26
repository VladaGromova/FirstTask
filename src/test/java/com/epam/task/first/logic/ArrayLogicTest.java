package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied(){
        // given
        Array array = new Array(1, 3, 2);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied(){
        Array array = new Array(-1, -3, -2);
        int actual = arrayLogic.findMax(array);
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenEqualNumbersApplied(){
        Array array = new Array(0, 0, 0);
        int actual = arrayLogic.findMax(array);
        Assert.assertEquals(0, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMaxShouldThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        int actual = arrayLogic.findMax(array);
    }

    @Test
    public void testFindMeanShouldFindMeanWhenResultIsDouble(){
        Array array = new Array(4, 1, 4,1);
        double actualDouble = arrayLogic.findMean(array);
        String actual = Double.toString(actualDouble);
        Assert.assertEquals("2.5", actual);
    }

    @Test
    public void testFindMeanShouldFindMeanWhenPositiveNumbersApplied(){
        Array array = new Array(4, 5, 4,3);
        double actualDouble = arrayLogic.findMean(array);
        String actual = Double.toString(actualDouble);
        Assert.assertEquals("4.0", actual);
    }

    @Test
    public void testFindMeanShouldFindMeanWhenNegativeNumbersApplied(){
        Array array = new Array(-4, -2, -4,-2);
        double actualDouble = arrayLogic.findMean(array);
        String actual = Double.toString(actualDouble);
        Assert.assertEquals("-3.0", actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMeanShouldThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        double actual = arrayLogic.findMean(array);
    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied(){
        Array array = new Array(1, 3, 2);
        int actual = arrayLogic.findMin(array);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied(){
        Array array = new Array(-1, -3, -2);
        int actual = arrayLogic.findMin(array);
        Assert.assertEquals(-3, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenEqualNumbersApplied(){
        Array array = new Array(0, 0, 0);
        int actual = arrayLogic.findMin(array);
        Assert.assertEquals(0, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMinShouldThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        int actual = arrayLogic.findMin(array);
    }

    @Test
    public void testChangeToTheOppositeShouldChangeToTheOppositeWhenPositiveNumbersApplied(){
        Array array = new Array(1, 2, 3);
        Array actual = arrayLogic.changeToTheOpposite(array);
        Array expected = new Array(-1, -2, -3);
        Assert.assertEquals(actual.getElements(), expected.getElements());
    }

    @Test
    public void testChangeToTheOppositeShouldChangeToTheOppositeWhenNegativeNumbersApplied(){
        Array array = new Array(-1, -2, -3);
        Array actual = arrayLogic.changeToTheOpposite(array);
        Array expected = new Array(1, 2, 3);
        Assert.assertEquals(actual.getElements(), expected.getElements());
    }

    @Test
    public void testChangeToTheOppositeShouldReturnArrayOfZerosWhenArrayOfZerosApplied(){
        Array array = new Array(-0, 0, 0);
        Array actual = arrayLogic.changeToTheOpposite(array);
        Array expected = new Array(0, 0, 0);
        Assert.assertEquals(actual.getElements(), expected.getElements());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testChangeToTheOppositeShouldThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        Array actual = arrayLogic.changeToTheOpposite(array);
    }

    @Test
    public void testFindSumShouldFindSumWhenPositiveNumbersApplied(){
        Array array = new Array(1, 3, 2);
        int actual = arrayLogic.findSum(array);
        Assert.assertEquals(6, actual);
    }
    @Test
    public void testFindSumShouldFindSumWhenNegativeNumbersApplied(){
        Array array = new Array(-1, -3, -2);
        int actual = arrayLogic.findSum(array);
        Assert.assertEquals(-6, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindSumShouldThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        int actual = arrayLogic.findSum(array);
    }

    @Test
    public void testGetNumberOfPositiveNumbersShouldWorkWhenBothPositiveAndNegativeApplied(){
        Array array = new Array(1, 3, -2);
        int actual = arrayLogic.getNumberOfPositiveNumbers(array);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testGetNumberOfPositiveNumbersShouldWorkWhenOnlyPositiveApplied(){
        Array array = new Array(1, 3, 2);
        int actual = arrayLogic.getNumberOfPositiveNumbers(array);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testGetNumberOfPositiveNumbersShouldWorkWhenOnlyNegativeApplied(){
        Array array = new Array(-1, -3, -2);
        int actual = arrayLogic.getNumberOfPositiveNumbers(array);
        Assert.assertEquals(0, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetNumberOfPositiveNumbersThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        int actual = arrayLogic.getNumberOfPositiveNumbers(array);
    }
    @Test
    public void testGetNumberOfNegativeNumbersShouldWorkWhenBothPositiveAndNegativeApplied(){
        Array array = new Array(1, 3, -2);
        int actual = arrayLogic.getNumberOfNegativeNumbers(array);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testGetNumberOfNegativeNumbersShouldWorkWhenOnlyPositiveApplied(){
        Array array = new Array(1, 3, 2);
        int actual = arrayLogic.getNumberOfNegativeNumbers(array);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testGetNumberOfNegativeNumbersShouldWorkWhenOnlyNegativeApplied(){
        Array array = new Array(-1, -3, -2);
        int actual = arrayLogic.getNumberOfNegativeNumbers(array);
        Assert.assertEquals(3, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetNumberOfNegativeNumbersThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        int actual = arrayLogic.getNumberOfNegativeNumbers(array);
    }

}
