package org.example;

public class pattern7 {
    public void pattern7_caller(int n){
        int c=0;
        for(int i=-((int)n/2);i<=((int)n/2);i++){
            for(int j=-((int)n/2);j<=((int)n/2);j++){
                if(c==j || -c==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i<0){
                c++;
            }else{
                c--;
            }
            System.out.println();
        }
    }
}
