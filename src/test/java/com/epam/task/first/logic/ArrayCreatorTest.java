package com.epam.task.first.logic;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1 2 3","3g 4 6");
    static DataReader reader;
    static ArrayValidator validator;
    static ArrayParser parser;
    @BeforeClass
    public static void before() throws DataException {

        reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        when(validator.validate("1q 2 3")).thenReturn(false);

        parser = Mockito.mock(ArrayParser.class);
        when(parser.create("1   2 3")).thenReturn(new Array(1, 2, 3));
    }

    @Test
    public void testProcess() throws DataException {
        com.epam.task.first.ArrayCreator director = new com.epam.task.first.ArrayCreator(reader, validator, parser);
    }
}
