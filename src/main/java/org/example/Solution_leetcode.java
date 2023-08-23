package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution_leetcode {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> c = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(c.containsKey(nums[i])){
                return new int[]{c.get(nums[i]),i};
            }else{
                c.put(diff,i);
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int n[]=new Solution_leetcode().twoSum(new int[]{3,2,4},6);
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }
}
