package com.mo.current;
//To display the current date, import the java.time.LocalDate class, and use its now() method.
import java.time.LocalDate;

public class date {
    public static void main(String[] args) {
        LocalDate myobj = LocalDate.now();
        System.out.println(myobj);
    }
}
