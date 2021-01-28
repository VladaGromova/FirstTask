package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(final DataReader dataReader, final ArrayValidator validator, final ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> process(String filename) throws DataException {
        List<Array> result = new ArrayList<Array>();

        List<String> stringsToValidate = dataReader.readData(filename);
        for(String line : stringsToValidate){
            if (validator.validate(line)){
                Array array = parser.create(line);
                result.add(array);
            }
        }
        return result;
    }
}
