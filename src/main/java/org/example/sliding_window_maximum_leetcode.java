package org.example;

import java.util.*;

public class sliding_window_maximum_leetcode {
    public int[] sliding_window_maximum_leetcode_caller_solution1(int[] data,int k){
        int[] temp=new int[data.length-k+1];
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++){
            p.add(data[i]);
        }
        temp[0]=p.peek();
        p.remove(data[0]);

        for(int i=k;i<data.length;i++){

            p.add(data[i]);
            temp[i-k+1]=p.peek();
            p.remove(data[i-k+1]);
        }
        return temp;
    }

    public int[] sliding_window_maximum_leetcode_caller_solution2(int[] data,int k){
        int[] temp=new int[data.length-k+1];
        Deque<Integer> p=new ArrayDeque<>();
        int i;
        for(i=0;i<k;i++){
            while((!p.isEmpty()) && data[i]>=data[p.getLast()]){
                p.removeLast();
            }
            p.addLast(i);
        }
        temp[0]=data[p.peekFirst()];

        for(;i<data.length;i++){
            while((!p.isEmpty()) && p.getFirst()<=i-k){
                p.removeFirst();
            }
            while((!p.isEmpty()) && data[i]>=data[p.peekLast()]){
                p.removeLast();
            }
            p.add(i);
            temp[i-k+1]=data[p.getFirst()];

        }
        return temp;
    }
    /*
    3
    3
    5
    5
    6
    7
     */

    public static void main(String[] args) {
        int data[]=new int[]{-224,6246,4619,6354,-7637,-2394,-992,5239,-6086,-4290,-8133,9111,-80,7533,-6084,-726,9191,-8212,-913,-4114,1016,772,4453,-1655,8782,2626,1469,-9263,4658,7488,-6252,-1055,-3616,2970,-2574,-2724,-9895,2260,6757,1761,-8694,-2969,5065,7487,9867,8767,-4459,1932,-1505,3382,-5497,6835,2567,-2885,-5934,-5046,-4429,1610,-4826,-333,-1984,-1652,-8906,1973,-7265,-3157,3062,5294,122,-5696,2421,2371,9862,4541,-6523,5754,-6077,6574,-649,-7300,-1248,-9920,-5881,-5816,8612,-7918,-5947,-3775,6069,-4314,-9108,2041,2303,-7419,8436,-5739,-5395,-1567,5245,3147,-734,-1949,-6930,-2932,848,-922,7338,816,8206,8262,-3180,-7796,4346,-8869,7862,3898,7616,-1651,1043,1307,6453,-7638,7421,5755,5240,-5551,-1085,9267,2553,6980,-5688,201,-3845,-4827,-1530,-1681,-8578,7746,8629,-1894,-2037,-8461,-622,-5466,6447,8685,-5714,-7697,-7140,5973,4026,9915,-5188,417,711,-4642,5014,2496,-2538,-4322,-1057,4444,2996,3427,-4061,7671,-8473,-2984,-4841,4788,-4094,6338,5350,8091,5989,-6682,8987,-3357,960,9403,-7473,9015,338,-3187,1672,-2855,5457,-4821,-6460,-9994,10000,1015,-2355,-8410,2326};
        int k = 3;
        int result1[]=new sliding_window_maximum_leetcode().sliding_window_maximum_leetcode_caller_solution1(data,k);
        int result2[]=new sliding_window_maximum_leetcode().sliding_window_maximum_leetcode_caller_solution2(data,k);
        Arrays.stream(result2).forEach(System.out::println);
    }
}
