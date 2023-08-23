package org.example;

public class Maximum_Rectangular_Area_in_a_Histogram_leetcode {
    public void find(int[] data){
        int[] previous_smallestno=new next_previous_small_no().previous_small_no(data);
        int[] next_smallestno=new next_previous_small_no().next_small_no(data);
        int max=0;
        for(int i=0;i<data.length;i++){
            int t=(next_smallestno[i]-previous_smallestno[i]-1)*data[i];
            if(t>max)
                max=t;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] data=new int[]{4,2,1,5,6,3,2,4,2};
        new Maximum_Rectangular_Area_in_a_Histogram_leetcode().find(data);
    }
}
