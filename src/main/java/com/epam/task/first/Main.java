package com.epam.task.first;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArraySorter;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(1, 2, 3);
        ArrayPrinter printer = new ConsoleArrayPrinter();
        printer.print(array);
        Array arrayToSort = new Array(5, 8, 1, 6, 4, 2, 3);
        ArraySorter sorter = new ArraySorter();
        sorter.shakerSort(arrayToSort);
        printer.print(arrayToSort);
    }
}
