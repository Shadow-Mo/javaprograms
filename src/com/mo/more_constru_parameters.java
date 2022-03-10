package com.mo;
//constructors with more parameters

public class more_constru_parameters {
    int modelyear;
    String modelname;
    public more_constru_parameters(int year, String name){
        modelname= name;
        modelyear= year;
    }

    public static void main(String[] args) {
        more_constru_parameters mycar = new more_constru_parameters(2016,"Maserati levanti");
        System.out.println(mycar.modelyear + " " + mycar.modelname);
    }
}
