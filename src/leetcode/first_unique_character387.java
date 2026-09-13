package leetcode;

import java.util.HashMap;

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
}
