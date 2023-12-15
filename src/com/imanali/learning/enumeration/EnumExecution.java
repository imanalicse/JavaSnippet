package com.imanali.learning.enumeration;
/**
 * An enum type is a special data type that enables for a variable to be a set of predefined constants.
 * */
public class EnumExecution {
    public static void execute() {
        System.out.println(HttpStatus.CREATED + ": "+ HttpStatus.CREATED.code());
        System.out.println("-----------");
        for (HttpStatus httpStatus: HttpStatus.values()) {
            System.out.println(httpStatus + ":" + httpStatus.code() + ": " + httpStatus.getReasonPhrase());
        }
    }
}
