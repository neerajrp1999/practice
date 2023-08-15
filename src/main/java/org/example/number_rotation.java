package org.example;

public class number_rotation {
    public int number_rotation(int num,int k){
        int index=((k%String.valueOf(num).length())+String.valueOf(num).length())%String.valueOf(num).length();
        int s= (int) Math.pow(10,(index));
        int left=(int)num/s;
        int right=(int)num%s;
        int final_num= (int) (left+right*(Math.pow(10,String.valueOf(left).length())));
        return final_num;
    }
}
