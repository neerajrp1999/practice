package org.example;

public class prime_factors {
    public void prime_factors_caller(int num){
        for(int i =2;i*i<=num;i++){
            while(num%i==0){
                num=(int)num/i;
                System.out.print(i+" ");
            }
        }
        if(num!=1){
            System.out.println(num);
        }
    }
}
