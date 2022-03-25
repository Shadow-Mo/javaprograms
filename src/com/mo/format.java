package com.mo.current;
//You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class format {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Before formatting: "+obj);
        DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

        String formatdate = obj.format(formatobj);
        System.out.println("After formatting: "+formatdate);
    }
}
