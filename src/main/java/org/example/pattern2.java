package org.example;

public class pattern2 {
    public void pattern2_caller(int n){
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

