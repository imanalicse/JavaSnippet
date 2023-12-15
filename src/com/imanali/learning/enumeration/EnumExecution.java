package com.imanali.learning.enumeration;
public class EnumExecution {
    public static void execute() {
        System.out.println(HttpStatus.CREATED + ": "+ HttpStatus.CREATED.code());
        System.out.println("-----------");
        for (HttpStatus httpStatus: HttpStatus.values()) {
            System.out.println(httpStatus + ":" + httpStatus.code() + ": " + httpStatus.getReasonPhrase());
        }
    }
}
