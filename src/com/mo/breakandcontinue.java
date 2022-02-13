package com.mo;

public class breakandcontinue {
    public static void main(String[] args) {
//        break
        for(int i=0;i<=10;i++){
            if (i==4){
                break;
            }
            System.out.println(i);
        }
//        continue
        for(int j=0;j<10;j++){
            if (j==4){
                continue;
            }
            System.out.println(j);
        }
//        break in while loop
        int k=0;
        while(k<10){
            System.out.println(k);
            k++;
            if (k==4){
                break;
            }
        }
//        continue in while loop
        int l=0;
        while(l<10){
            if (l==4){
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        }
    }
}
