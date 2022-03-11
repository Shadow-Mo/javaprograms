package com.mo;

public class inheritance {
    protected String brand = "Maserati";
        public void honk(){
            System.out.println("tuut tuut");
        }
    }
    class car extends inheritance{
            private String modelname = "Levanti";

            public static void main(String[] args) {
                car mycar = new car();
                mycar.honk();
                System.out.println(mycar.brand + " " + mycar.modelname);
            }
    }
