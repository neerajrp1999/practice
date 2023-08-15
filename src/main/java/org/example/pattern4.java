package org.example;

public class pattern4 {
    public void pattern4_caller(int n){
        for (int i=0;i<n;i++){
            for(int j=n;j>=1;j--){
                if(j<=(n-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
