package practice;

import java.util.HashMap;

public class hashmapStringAnagram {
    static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String s="dewansh";
        String t="dewanshf";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            map.get(ch2,map.getOrDefault(ch2,0)-1);
        }
        f
    }
}
