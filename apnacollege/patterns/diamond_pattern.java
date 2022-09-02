package com.apnacollege.problems.patterns;

//print the diamond pattern
//                             n=4            stars
//   *     --              | i=1    spaces=3      1 star
//  ***      |  upper -----| i=2    spaces=2      3 star
// *****     |  half  -----| i=3    spaces=1      5 star
//*******  --              | i=4    spaces=0      7 star
//*******  --
// *****     |  lower             star= 2*i-1
//  ***      |  half
//   *     --

public class diamond_pattern {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i=n; i>=1; i--){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
