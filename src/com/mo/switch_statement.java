package com.mo;

public class switch_statement {
    public static void main(String[] args) {
        //Switch statement
        /*
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
         */
                //break keyword- breaks out of switch block
            // default keyword- specifies some code to run if there is no case metch
            int days = 4;
            switch (days){
                case 6:
                    System.out.println("today is saturday");
                    break;
                case 7:
                    System.out.println("today is sunday");
                    break;
                default:
                    System.out.println("looking forward to the weekend");
            }
        }
    }

