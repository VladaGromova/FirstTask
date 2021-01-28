package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayParser {
    // сюда передаются только валидные строчки
    public Array create(String data){
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        String[] parts = data.split(" ");
        for(int i=0; i<parts.length; ++i){
            int number = Integer.parseInt(parts[i]);
            listOfNumbers.add(number);
        }
        Array result = new Array(listOfNumbers);
        return result;
    }
}
