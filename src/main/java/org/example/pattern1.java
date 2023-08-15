package org.example;

public class pattern1 {
    public void pattern1_caller(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
