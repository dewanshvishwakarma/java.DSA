package Sliding_window;

import java.util.HashMap;

public class Lc3_longest_sub_String {
    static int Sub_String(String s){
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        int i=0;
        int maxL=0;
        for (int j=0;j<n;j++){
            char ch=s.charAt(j);
            if (map.containsKey(ch) && i<=map.get(ch)){
                i=map.get(ch)+1;
            }
            map.put(ch,j);
            maxL=Math.max(maxL,j-i+1);
        }
return maxL;
    }
    public static void main(String[] args) {
    String s1="bbbbb";
    String s2= "pwwkew";
    int result=Sub_String(s2);
    String s3="abcdcdea";
    int result=Sub_String(s3);
        System.out.println(result);
    }
}
