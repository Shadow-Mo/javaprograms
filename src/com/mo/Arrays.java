package com.mo;

public class Arrays {
    public static void main(String[] args) {
//        access the elements of array
        String[] cars = {"volvo", "bmw", "ford", "mazda"};
        System.out.println(cars[0]);
//        change an array element
        cars[0] = "opel";
        System.out.println(cars[0]);
//        Array length
        System.out.println(cars.length);
//        loop through an array
        for(int i=0; i< cars.length;i++){
            System.out.println(cars[i]);
        }
//        loop through an array with for-each
        for (String i : cars){
            System.out.println(i);
        }
//        Multidimensional arrays
        int[][] num={{1,2,3,4},{5,6,7}};
        int x = num[1][2];
        System.out.println(x);
//        for loop inside a for loop
        for (int j=0;j<num.length;j++){
            for (int k=0;k<num[j].length;k++){
                System.out.println(num[j][k]);
            }
        }
    }
}
