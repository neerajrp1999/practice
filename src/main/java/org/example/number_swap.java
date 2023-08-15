package org.example;

public class number_swap {
    public int number_swap_call(int num){
        int final_num=0;
        int index=1;
        while(num>0){
            int last=num%10;
            final_num+=index*(Math.pow(10,last-1));
            num=(int)num/10;
            index++;
        }
        return final_num;
    }
}
