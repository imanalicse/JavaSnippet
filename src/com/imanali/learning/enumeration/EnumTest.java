package com.imanali.learning.enumeration;
/**
 * An enum type is a special data type that enables for a variable to be a set of predefined constants.
 * */
public class EnumTest {
    public static void run() {
        System.out.println(HttpStatus.CREATED + ": "+ HttpStatus.CREATED.code());
        System.out.println("-----------");
        for (HttpStatus httpStatus: HttpStatus.values()) {
            System.out.println(httpStatus + ":" + httpStatus.code() + ": " + httpStatus.getReasonPhrase());
        }

        switchEnum(DaysOfWeek.SUNDAY);
    }

    public static void switchEnum(DaysOfWeek day) {
        switch (day) {
            case FRIDAY: case SATURDAY:
                System.out.println("Happy weekend");
                break;
            case SUNDAY:
                System.out.println("Office start day");
                break;
            default:
                System.out.println("No day");
                break;
        }
    }
}
