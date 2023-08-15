package org.example;

public class pattern3 {
    public void pattern3_caller(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
