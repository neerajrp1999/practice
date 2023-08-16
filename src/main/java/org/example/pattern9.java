package org.example;

public class pattern9 {
    public void pattern9_caller(int n){
        int c=n-1,count=1;
        for(int i=-(int)n/2;i<=(int)n/2;i++){
            for(int j=-(n-1);j<=n-1;j++){
                if(j<=-c || j>=c){
                    System.out.print(count);
                }else{
                    System.out.print(" ");
                }

                if(j<0){
                    count++;
                }else{
                    count--;
                }
            }
            if(i<n){
                c--;
                count=count+1;
            }else{
                c++;
            }
            System.out.println();
        }
    }
}