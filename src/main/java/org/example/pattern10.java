package org.example;

public class pattern10 {
    public void pattern10_caller(int n){
        int c=0,count=1;
        for(int i=-(int)n/2;i<=(int)n/2;i++){
            for(int j=-((int)n/2);j<=((int)n/2);j++){
                if(i==0){
                    System.out.print("*");
                }else if(j>=0 && j<=c){
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
