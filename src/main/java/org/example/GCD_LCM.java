package org.example;

public class GCD_LCM {
    public int GCD_calller(int num1, int num2){
        int largerNum= num1<=num2?num2:num1;
        int smallerNum= num1<=num2?num1:num2;
        while(true){
            if(largerNum%smallerNum!=0){
                int r=largerNum%smallerNum;
                largerNum=smallerNum;
                smallerNum=r;
            }else{
                break;
            }
        }
        return smallerNum;
    }
    public int LCM_calller(int num1,int num2){
        return  (num1*num2)/GCD_calller(num1,num2);
    }
}
