package com.mo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("W3schools",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3schools!");
        Boolean matchfound = matcher.find();
        if (matchfound){
            System.out.println("Match Found");
        }else {
            System.out.println("Match not found");
        }
    }
}
