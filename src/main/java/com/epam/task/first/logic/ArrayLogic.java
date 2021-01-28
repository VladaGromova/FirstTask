package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayLogic {

    private void checkValidity(List<Integer> elements){
        if (elements.isEmpty()){
            throw new IllegalArgumentException("Array is empty!");
        }
    }

    public int findMax(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int max = elements.get(0);
        for (Integer element : elements){
            if(element > max){
                max = element;
            }
        }
        return max;
    }

    public int findMin(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int min = elements.get(0);
        for (Integer element : elements){
            if(element < min){
                min = element;
            }
        }
        return min;
    }

    public double findMean(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int sum = findSum(array);
        return (double) sum/(elements.size());
    }

    public int findSum(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int sum = 0;
        for (Integer element : elements){
            sum += element;
        }
        return sum;
    }

    public int getNumberOfPositiveNumbers(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int quantity = 0;
        for (Integer element : elements){
            if(element > 0){
                ++quantity;
            }
        }
        return quantity;
    }

    public int getNumberOfNegativeNumbers(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int quantity = 0;
        for (Integer element : elements){
            if(element < 0){
                ++quantity;
            }
        }
        return quantity;
    }

    public Array changeToTheOpposite(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int size = elements.size();
        for (int i=0; i< size; ++i){
            int newNumber = (elements.get(i))*(-1);
            elements.remove(i);
            elements.add(i, newNumber);
        }
        Array result = new Array(elements);
        return result;
    }

}
