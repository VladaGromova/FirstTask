package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    private ArraySorter sorter = new ArraySorter();

    @Test
    public void testBubbleSortShouldSortWhenArrayIsNotEmpty(){
        Array actual = new Array(5, 6, 2, 3,1,9, 2);
        sorter.bubbleSort(actual);
        Array expected = new Array(1, 2, 2, 3, 5, 6, 9);
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBubbleSortShouldThrowExceptionWhenArrayIsEmpty(){
       Array array = new Array();
       sorter.bubbleSort(array);
    }

    @Test
    public void testShakerSortShouldSortWhenArrayIsNotEmpty(){
        Array actual = new Array(5, 6, 2, 3,1,9, 2);
        sorter.shakerSort(actual);
        Array expected = new Array(1, 2, 2, 3, 5, 6, 9);
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testShakerSortShouldThrowExceptionWhenArrayIsEmpty(){
        Array array = new Array();
        sorter.shakerSort(array);
    }
}
