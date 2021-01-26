package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySorter {

    private void checkValidity(List<Integer> elements){
        if (elements.isEmpty()){
            throw new IllegalArgumentException("Array is empty!");
        }
    }

    private void swap(List<Integer> elements, int firstIndex, int secondIndex){
        int tmp = elements.get(firstIndex);
        int elementToReplace = elements.get(secondIndex);
        elements.set(firstIndex, elementToReplace);
        elements.set(secondIndex, tmp);
    }

    public void bubbleSort(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int size = elements.size();
        for (int j = size; j>0; --j){
            for (int i = 0; i<(j-1); ++i){
                int firstElement = elements.get(i);
                int secondElement = elements.get(i+1);
                if(firstElement>secondElement){
                    swap(elements, i, (i+1));
                }
            }
        }
        array = new Array(elements);
    }

    public void shakerSort(Array array){
        List<Integer> elements = array.getElements();
        checkValidity(elements);
        int size = elements.size();
        int leftMark = 1;
        int rightMark = size - 1;
        int firstElement;
        int secondElement;
        while (leftMark <= rightMark) {
            for (int i = rightMark; i >= leftMark; i--) {
                firstElement = elements.get(i-1);
                secondElement = elements.get(i);
                if (firstElement > secondElement) {
                    swap(elements, i - 1, i);
                }
            }
            leftMark++;
            for (int i = leftMark; i <= rightMark; i++) {
                firstElement = elements.get(i-1);
                secondElement = elements.get(i);
                if (firstElement > secondElement) {
                    swap(elements, i - 1, i);
                }
            }
            rightMark--;
        }
        array = new Array(elements);
    }
}
