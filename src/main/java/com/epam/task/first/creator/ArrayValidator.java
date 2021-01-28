package com.epam.task.first.creator;

import java.util.regex.Pattern;

public class ArrayValidator {

    private static final String DIGIT_PATTERN = "^[0-9 ]+$";

    public boolean validate(String line){
        boolean isValid = Pattern.matches(DIGIT_PATTERN, line);
        return isValid;
    }
}
