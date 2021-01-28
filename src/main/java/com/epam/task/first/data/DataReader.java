package com.epam.task.first.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readData(String filename)throws DataException{
        // FileInputStream, FileReader
        List<String> stringCollection = new ArrayList();
        try{
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()){
                String stringToValidate = bufferedReader.readLine();
                stringCollection.add(stringToValidate);
            }
        } catch(IOException e){
            throw new DataException(e.getMessage(), e);
        }
        return stringCollection;
    }
}
