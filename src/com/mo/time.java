package com.mo.current;
//To display the current time (hour, minute, second, and nanoseconds),
// import the java.time.LocalTime class, and use its now() method.
import java.time.LocalTime;

public class time {
    public static void main(String[] args) {
        LocalTime myobj = LocalTime.now();
        System.out.println(myobj);
    }
}
