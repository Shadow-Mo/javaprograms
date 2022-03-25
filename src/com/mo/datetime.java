package com.mo.current;
//To display the current date and time,
// import the java.time.LocalDateTime class, and use its now() method.
import java.time.LocalDateTime;

public class datetime {
    public static void main(String[] args) {
        LocalDateTime myobj = LocalDateTime.now();
        System.out.println(myobj);
    }
}
