package org.example;

public class any_base_to_decimal {
    public void any_base_to_decimal_test(int number,int base){

        int power=0,result=0;
        while (number > 0) {
            int a = number % 10;
            number = number / 10;
            result = result + a * (int) Math.pow(base, power);
            power++;
        }

        System.out.println(result);
    }

    public void any_base_to_decimal_test(String number,int base){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int power=0,result=0;
        while ((number.length()) > 0) {
            int n=0;
            if(Character.isDigit(number.charAt(number.length()-1))) {
                n=Integer.valueOf(String.valueOf(number.charAt(number.length()-1)));
            }else{
                n=alphabet.indexOf(number.charAt(number.length()-1))+10;
            }
            number = number.substring(0,number.length()-1);
            result = result + n * (int) Math.pow(base, power);
            power++;
        }
        System.out.println(result);
    }
}
