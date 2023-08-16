package org.example;

public class pattern8 {
    public void pattern8_caller(int n){
        int c=0,count=1;
        for(int i=-(int)n/2;i<=(int)n/2;i++){
            for(int j=-(int)n/2;j<=(int)n/2;j++){
                if(!(j<-c) && !(j>c)){
                    System.out.print(count);
                    if(j<0){
                        count=count+1;;
                    }else{
                        count=count-1;
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i<0){
                count=count+2;
                c++;
            }else{
                c--;
            }
            System.out.println();
        }
    }
}
