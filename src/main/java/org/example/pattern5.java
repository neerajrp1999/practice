package org.example;
import  java.lang.Math;
public class pattern5 {

    public void pattern5_caller(int n){
        int c=0;
        for(int i=-(int)n/2;i<=(int)n/2;i++){
            for(int j=-(int)n/2;j<=(int)n/2;j++){
                if(!(j>c) && !(j<-c)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i>=0){
                c--;
            }else{
                c++;
            }
            System.out.println();
        }
    }
}
