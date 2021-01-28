package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private  final static String TEST_DATA = "src/test/resources/input.txt";
    private  final static String FALSE_DATA = "src/test/resources/output.txt";
    private DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldReadLinesFromFileWhenFileExists() throws DataException {
        List<String> expected = Arrays.asList("1 2 3", "4 5", "7g 6 1111    9");
        List<String> actual = reader.readData(TEST_DATA);
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = DataException.class)
    public void testReadDataShouldThrowExceptionWhenFileDoesNotExist() throws DataException {
        List<String> actual = reader.readData(FALSE_DATA);
    }
}
