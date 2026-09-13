package leetcode;

import java.util.HashMap;

// using the hashMAp
public class first_unique_character387 {
    static int FUC(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();

        for (int i=0;i<n;i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i=0;i<n;i++){
            char ch2=s.charAt(i);
            if (map.get(ch2)==1){
                return i;
            }
        }
        return -1;
    }

    //use frequency array

    static int FUC1(String s){
        int n=s.length();
        int[] ans=new int[26];
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            ans[index]=ans[index]+1;
        }
        for (int i=0;i<n;i++){
            char ch2=s.charAt(i);
            int index2=ch2-'a';
            if (ans[index2]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s="dee";
        int result=FUC1(s);
        System.out.println("first unique character is " + result );

    }
}
