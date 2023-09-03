package org.example;

import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        int count[] = new int[32];
        for (int i = 0; i < 32; i++)
            for (int j = 0; j < nums.length; j++)
                if ((nums[j] & (1 << i)) != 0)
                    count[i] += 1;
        int res = 0;
        System.out.println(res);
        for (int i = 0; i < 32; i++) {
            res += (count[i] % 3) * (1 << i);
            System.out.println(res);
        }
        res = res / (nums.length % 3);

        return res;
    }
    public static void generateParenthesisCaller(int n){
        if(n<0) {
            System.out.println("return");
            System.out.println(n);
            return;
        }
        System.out.println("before:"+n);
        generateParenthesisCaller(n-1);
        System.out.println("After:"+n);
    }
    public int findSunNNaturanNumber(int n){
        if(n<=1){
            return 1;
        }
        return n+findSunNNaturanNumber(n-1);
    }
    public List<String> generateParenthesis(int n){
        List<String> stringList=new ArrayList<>();
        String s="";
        generateParenthesisCaller(n);
        return stringList;
    }
    public static void main(String[] args) {
        //System.out.println("ans:"+new Solution().findReplaceString1( "vmokgggqzp", new int[]{3,5,1}, new String[]{"kg","ggq","mo"}, new String[]{"s","so","bfr"}));
        //System.out.println("ans:"+new Solution().findReplaceString1( "cizokxcijwbyspcfcqws", new int[]{17,1,14,3,9,11}, new String[]{"qw","iz","cf","okxc","wb","ysp"}, new String[]{"m","rq","hc","ymfy","mt","drn"}));
        //System.out.println("ans:"+new Solution().findReplaceString1( "abcde", new int[]{2,2}, new String[]{"cde","cdef"}, new String[]{"fe","f"}));
        //System.out.println("ans:"+new Solution().singleNumber(  new int[]{0,1,0,2,2,2,1,0,1,1}));
        //new Solution().grayCode(2).stream().forEach(System.out::println);
        //generateParenthesisCaller(5);
        //System.out.println("ans:"+new Solution().findSunNNaturanNumber(4));
        //new Solution().merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        new Solution().removeDuplicates(new int[]{1,1,2});


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m+n-1;
        System.out.println("p:"+p);
        n--;
        System.out.println("n:"+n);
        m--;
        System.out.println("m:"+m);
        while(p>=0 && m>0 && n>0){
            if(nums1[n]>nums2[m] && m>0 && n>0){
                nums1[p--]=nums1[m--];

                System.out.println("while if");
                System.out.println("p:"+p);
                System.out.println("n:"+n);
                System.out.println("m:"+m);
                System.out.println(nums1);

            }else{
                nums1[p--]=nums2[n--];
                System.out.println("while else");
                System.out.println("p:"+p);
                System.out.println("n:"+n);
                System.out.println("m:"+m);
                System.out.println(nums1);

            }
        }
        while(m>0){}{
            nums1[p--]=nums1[m--];
        }
        while(n>0) {
            nums1[p--]=nums2[n--];
        }
        for (int j:nums1) {
            System.out.println(j);
        }
        Arrays.stream(nums1).forEach(System.out::println);

    }

    public int reverse(int x) {
        boolean is=false;
        if(x<0){
            is=true;
            x*=-1;
        }
        int result=0;
        while(x>0){
            result=result*10+x%10;
            System.out.println(result);
            if(result>Integer.MAX_VALUE){
                return 0;
            }
            x=x/10;
        }
        if(result>Integer.MAX_VALUE){
            return 0;
        }
        // 2147483648
        // 1056389759
        return (int)(is? result*-1:result);
    }

    public int findNthDigit(int n) {
            int digitSize = 1;
            int startNum = 1;
            long count = 9;

            while (digitSize * count < n) {
                n -= digitSize * count;
                ++digitSize;
                startNum *= 10;
                count *= 10;
            }

            final int targetNum = startNum + (n - 1) / digitSize;
            final int index = (n - 1) % digitSize;
            return String.valueOf(targetNum).charAt(index) - '0';
        }


    public int calculate(String s) {
            int ans = 0;
            int num = 0;
            int sign = 1;
            Deque<Integer> stack = new ArrayDeque<>();
            stack.push(sign);
            System.out.println(stack);
            for (final char c : s.toCharArray()) {
                System.out.println("___________");
                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');

                    System.out.println("num if1:" + num);
                } else if (c == '(') {
                    stack.push(sign);
                    System.out.println("c else if1:" + c);
                    System.out.println("sign else if1:" + sign);
                    System.out.println(stack);
                } else if (c == ')') {
                    stack.pop();
                    System.out.println(")");
                    System.out.println(stack);
                } else if (c == '+' || c == '-') {
                    System.out.println("else last");
                    System.out.println("" + ans);
                    System.out.println("" + sign);
                    System.out.println("" + num);
                    ans += sign * num;
                    System.out.println("" + ans);
                    sign = (c == '+' ? 1 : -1) * stack.peek();
                    num = 0;
                }
            }
            return ans + sign * num;
        }

    public int calculate1(String s) {
        int ans = 0;
        int num = 0;
        int sign = 1;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(sign);
        System.out.println(stack);
        for (final char c : s.toCharArray()) {
            System.out.println("___________");
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');

                System.out.println("num if1:" + num);
            } else if (c == '(') {
                stack.push(sign);
                System.out.println("c else if1:" + c);
                System.out.println("sign else if1:" + sign);
                System.out.println(stack);
            } else if (c == ')') {
                stack.pop();
                System.out.println(")");
                System.out.println(stack);
            } else if (c == '+' || c == '-') {
                System.out.println("else last");
                System.out.println("ans:" + ans);
                System.out.println("sign:" + sign);
                System.out.println("num:" + num);
                ans += sign * num;
                System.out.println("ans s:" + ans);
                sign = (c == '+' ? 1 : -1) * stack.peek();

                System.out.println("sa:" + sign);
                num = 0;
            }
        }
        return ans + sign * num;
    }
    public int romanToInt(String s) {
        Map<Character,Integer> map= Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int previous=0,result=0;
        System.out.println(s);
        for (int i = 0; i <s.length() ; i++) {
            int j=map.get(s.charAt(i));
            if(previous==j){
                result+=j;
            }else if(result==0){
                result=j;
            }else if(previous<j){
                result+=j-2*previous;
            }else if(previous>j){
                result+=j;
            }
            previous=j;
            System.out.println(result);
        }
        return result;
    }

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int i=0,k=0;
        String r="";
        int[] d=indices.clone();
        Arrays.sort(d);
        Arrays.stream(d).forEach(System.out::println);
        while(true){
            int g=-1;
            int index=-1;
            System.out.println("i:"+i);
            System.out.println("d.lenght:"+d.length);
            if(i<d.length){
                g=d[i];
                System.out.println("g="+g);
                for(int i1=0;i<indices.length;i++){
                    if(indices[i1]==g){
                        index=i1;
                        break;
                    }
                }
            }
            System.out.println("k:"+k);
            System.out.println("g:"+g);
            System.out.println("index:"+index);
            if(k==g){
                String so=sources[index];
                String t=targets[index];
                System.out.println("Equal:");
                System.out.println("k:"+k);
                System.out.println("g:"+g);
                System.out.println("index:"+index);
                System.out.println("so:"+so);
                System.out.println("t:"+t);
                i++;
                int j=0;
                while(j<so.length()){
                    if(so.charAt(j)==s.charAt(k+j)){
                        System.out.println();
                        j++;
                        //k++;
                    }else{break;}
                }
                if(j==so.length()){
                    r+=t.toString();
                    System.out.println("r:"+r);
                    k+=j;
                }else {
                    r+=s.charAt(k);
                    System.out.println("r:else:"+r);
                    k++;
                }

            }
            else{
                if(k>=s.length()){break;}
                r+=s.charAt(k);
                System.out.println("r:else:"+r);
                k++;
            }

        }
        return r;
    }
    public List<Integer> grayCode(int n) {
        List<Integer> rs=new ArrayList<Integer>();
        rs.add(0);
        for(int i=0;i<n;i++){
            System.out.println("=============");
            int size=rs.size();
            System.out.println(size);
            System.out.println(i);
            for(int k=size-1;k>=0;k--) {
                System.out.println(k);

                rs.add(rs.get(k) | 1 << i);
            }
        }
        return rs;
    }
    public String findReplaceString1(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer,int[]> map=new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            if(!map.containsKey(indices[i]))
                map.put(indices[i],new int[]{i,i});
            else
                map.put(indices[i],new int[]{map.get(indices[i])[0],i});
        }
        Set<Integer> key=map.keySet();
        TreeSet<Integer> k=new TreeSet<>(key);

        System.out.println(key.stream().sorted());
        int j=0;
        Iterator<Integer> it = k.iterator();
        while(it.hasNext()) {
            int i = it.next();
            System.out.println(i);
            String so=sources[map.get(i)[0]];
            String t=targets[map.get(i)[0]];
            //if (s.substring(i, i + so.length()).equals(s)) s = s.substring(0, i) + t +s.substring(i + so.length());
            System.out.println("out:j:"+j);
            System.out.println("out:s:"+s);
            System.out.println("out:so:"+so);
            System.out.println("out:t:"+t);
            try {
                System.out.println(s.substring(i + j, i + j + so.length()));
                if (s.substring(i + j, i + j + so.length()).equals(so)) {
                    s = s.substring(0, i + j) + t + s.substring(i + j + so.length());
                    System.out.println("if::" + s);
                    j = j + (t.length() - so.length())
                    ;
                    //j =j+(t.length()-so.length())+t.length();
                }
            }catch (Exception x){}
            }
        return s;
        }

        /*
        int i=0,k=0;
        String r="";
        int[] indices2=indices.clone();
        String[] sources2=sources.clone();
        String[] targets2=targets.clone();
        Arrays.sort(indices2);
        for (int num=0;num<indices2.length;num++) {
            for (int j = 0; j < indices.length; j++) {
                if(indices2[num]==indices[i]){
                    sources2[num]=sources[i];
                    targets2[num]=targets[i];
                    break;
                }
            }
        }

        while(true){
            int g=-1;
            if(! (i>=indices2.length)){
                g=indices2[i];
            }

            if(k==g){
                String so=sources2[i];
                String t=targets2[i];
                i++;
                int j=0;
                while(j<so.length()){
                    if(so.charAt(j)==s.charAt(k+j)){
                        System.out.println();
                        j++;
                        //k++;
                    }else{break;}
                }
                if(j==so.length()){
                    r+=t.toString();
                    k+=j;
                }else {
                    r+=s.charAt(k);
                    System.out.println("r:else:"+r);
                    k++;
                }

            }else{
                if(k>=s.length()){break;}
                r+=s.charAt(k);
                System.out.println("r:else:"+r);
                k++;
            }

        }
        return r;

         */

            public int removeDuplicates(int[] nums) {
                int k=nums.length;
                int[] r=new int[nums.length];
                r[0]=nums[0];
                --k;
                int j=1;
                for(int i=1;i<nums.length;i++){
                    if(nums[i]!=nums[j-1]){
                        nums[j]=nums[i];
                        k--;
                        j++;
                    }
                }
                Arrays.stream(nums).forEach(System.out::println);
                System.out.println(j);
                return k;

            }


}


 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


