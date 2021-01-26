package com.epam.task.first.creator;

import java.util.regex.Pattern;

public class ArrayValidator {

    public boolean validate(String line){
        //boolean isValid = Pattern.matches("/^\\d+( \\d+)*$/", line);
        boolean isValid = Pattern.matches("^[0-9 ]+$", line);
        return isValid;
    }
}
