package org.example;

public class digit_frequency {
    public void digit_frequency_caller(int number, int digit){
        int result=0;
        while(number>0){
            int r=number%10;
            number=number/10;
            if(r==digit){
                result++;
            }
        }
        System.out.println(result);
    }
}
