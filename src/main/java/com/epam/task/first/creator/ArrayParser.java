package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayParser {
    // сюда передаются только валидные строчки
    public Array create(String data){
        List listOfNumbers = new ArrayList<Integer>();
        int number;
        String[] numbers = data.split(" ");
        for(int i=0; i<numbers.length; ++i){
            number = Integer.parseInt(numbers[i]);
            listOfNumbers.add(number);
        }
        Array result = new Array(listOfNumbers);
        return result;
    }
}
