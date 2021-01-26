package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private  final static String TEST_DATA = "C:\\Java Web Development\\projects\\FirstTask\\src\\test\\resources\\input.txt";
    private  final static String FALSE_DATA = "C:\\Java Web Development\\projects\\FirstTask\\src\\test\\resources\\output.txt";
    private DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldReadLinesFromFileWhenFileExists() throws DataException {
        List<String> expected = new ArrayList<String>();
        expected.add("1 2 3");
        expected.add("4 5");
        expected.add("7g 6 1111    9");
        List<String> actual = reader.readData(TEST_DATA);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test (expected = DataException.class)
    public void testReadDataShouldThrowExceptionWhenFileDoesNotExist() throws DataException {
        List<String> actual = reader.readData(FALSE_DATA);
    }
}
