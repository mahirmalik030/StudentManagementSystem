package util;

import exception.InvalidMarksException;

public class ValidationUtil {

    public static void validateMarks(int marks)
            throws InvalidMarksException {

        if(marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                    "Marks must be between 0 and 100");
        }
    }
}