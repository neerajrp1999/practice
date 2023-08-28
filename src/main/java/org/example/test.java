package org.example;

public class test {
    public static void main(String[] args) {
        new test().findNthDigit(1000000000);
    }
    public void test1(){
        int c=0;
        int n=3;
        int k=1;
        String bin2=String.valueOf(c);

        System.out.println(bin2);
        for(int i=0;i<n-1;i++) {
            /*
            int len=Integer.toBinaryString(c).length();
            int d11=c<<1;
            int d12=d11|1;
            int d13=d12<<len;
            String d15=Integer.toBinaryString(~c);
            d15=d15.substring(d15.length()-len,d15.length());
            System.out.println("c:"+c);
            System.out.println("d15:"+d15);
            int d16=Integer.valueOf(d15,2);
            System.out.println("d16:"+d16);
            int d14=d13|d16;
            System.out.println(d14);
            c=d14;
            System.out.println(Integer.toBinaryString(c));


             */

            String inverse = bin2.replaceAll("0", "x").replaceAll("1", "0").replaceAll("x", "1");
            inverse=new StringBuffer(inverse).reverse().toString();
            bin2=bin2 +"1"+ inverse;
            System.out.println(bin2);
        }
        System.out.println(bin2.charAt(k-1));

    }

    public int findNthDigit(int n) {
        int digitsize=1;
        int start_num=1;
        long digit_count=9;

        while(digit_count*digitsize <n){
            n-=digit_count*digitsize;
            ++digitsize;
            start_num*=10;
            digit_count*=10;
            System.out.println("....... ");
            System.out.println(n);
            System.out.println(digitsize);
            System.out.println("start_num"+start_num);
            System.out.println("digit_count"+
                    digit_count);
        }
        n--;
        int num=start_num+n/digitsize;
        int index=n%digitsize;
        System.out.println(10*0+(String.valueOf(num).charAt(index)-'0'));
        return 10*0+(String.valueOf(num).charAt(index)-'0');
    }
}
