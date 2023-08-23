package org.example;

import java.util.Arrays;
import java.util.Stack;

public class next_previous_large_no {
    public int[] previous_large_no(int[] data){
        int[] temp=new int[data.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i< data.length;i++){
            while(!stack.empty() && data[stack.peek()]<=data[i]){
                stack.pop();
            }
            if(stack.empty()){
                temp[i]=-1;
                stack.push(i);
            }else{
                temp[i]=stack.peek();
                stack.push(i);
            }
        }
        return temp;
    }

    public int[] next_large_no(int[] data){
        int[] temp=new int[data.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=data.length-1;i>=0;i--){
            while(!stack.empty() && data[stack.peek()]<=data[i]){
                stack.pop();
            }
            if(stack.empty()){
                temp[i]=data.length;
                stack.push(i);
            }else{
                temp[i]=stack.peek();
                stack.push(i);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] data=new int[]{4,2,1,5,6,3,2,4,2};
        int[] d=new next_previous_large_no().previous_large_no(data);
        //Arrays.stream(d).forEach(System.out::println);
        int[] d1=new next_previous_large_no().next_large_no(data);
        Arrays.stream(d1).forEach(System.out::println);

    }
}
