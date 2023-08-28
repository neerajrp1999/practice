package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class Infix_Evaluation {
    public void Infix_Evaluation_caller(String e){
        Stack<String> operate=new Stack<>();
        Stack<Integer> oparent=new Stack<>();

        ArrayList<String> c=new ArrayList<>();
        int start=0;
        for(int i=0;i<e.length();i++){
            String s=e.substring(i,i+1);
            int precedent=new Infix_Evaluation().precedent(s);
            if(precedent!=5){
                c.add(e.substring(start,i));
                start=i+1;
                c.add(e.substring(i,i+1));
            } else if (i==e.length()-1) {
                c.add(e.substring(start,i+1));
            }
        }
        for (String s:c) {
            if(s.isEmpty()){
                continue;
            }
            int precedent=new Infix_Evaluation().precedent(s);
            if(precedent>=1 && precedent<=4){
                if(s.equals(")")){
                    while (!operate.peek().equals("(")){
                        int result=new Infix_Evaluation().operation(operate.pop(),oparent.pop(),oparent.pop());
                        oparent.push(result);
                    }
                    operate.pop();

                    System.out.println(oparent);
                    System.out.println(operate);
                }else if(precedent>=1 && precedent<=3){
                    while(!operate.empty() && new Infix_Evaluation().precedent(operate.peek())>=precedent && new Infix_Evaluation().precedent(operate.peek())!=4){
                        int result=new Infix_Evaluation().operation(operate.pop(),oparent.pop(),oparent.pop());
                        oparent.push(result);
                    }
                    operate.push(s);

                    System.out.println(oparent);
                    System.out.println(operate);
                }else if(s.equals("(")){
                    operate.push(s);

                    System.out.println(oparent);
                    System.out.println(operate);
                }
            }
            else{
                oparent.push(Integer.valueOf(s.trim()));

                System.out.println(oparent);
                System.out.println(operate);
            }
        }
        while (!operate.empty()){
            int result=new Infix_Evaluation().operation(operate.pop(),oparent.pop(),oparent.pop());
            oparent.push(result);
        }
        System.out.println(oparent);
        System.out.println(operate);
        System.out.println(oparent.pop());
    }
    public int operation(String c,int b,int a){
        switch (c){
            case "-":
                return a-b;
            case "+":
                return a+b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                return 0;
        }
    }
    public int precedent(String c){
        switch (c){
            case "-":
                return 1;
            case "+":
                return 1;
            case "*":
                return 2;
            case "/":
                return 3;
            case "(":
                return 4;
            case ")":
                return 4;
            default:
                return 5;
        }
    }
    public static void main(String[] args) {
        String q="1+2*5/3+6/4*2";
        String q1="(3-6)*7+30*9";


        //new Infix_Evaluation().Infix_Evaluation_caller(q);
        System.out.println(new Infix_Evaluation().Infix_Evaluation_caller2(q));
    }
    public int Infix_Evaluation_caller2(String s){
        if (s == null || s.isEmpty()) return 0;
        int length = s.length();
        int currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '+' || operation == '-') {
                    result += lastNumber;
                    lastNumber = (operation == '+') ? currentNumber : -currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    lastNumber = lastNumber / currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}
