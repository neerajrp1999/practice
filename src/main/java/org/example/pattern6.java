package org.example;

public class pattern6 {
    public void pattern6_caller(int n){
        int c=1;
        for(int i=-((int)n/2);i<=((int)n/2);i++){
            for(int j=-((int)n/2+1);j<=((int)n/2+1);j++){
                if(j>-c && j<c){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            if(i<0){
                c++;
            }else {
                c--;
            }
            System.out.println();
        }
    }
}
