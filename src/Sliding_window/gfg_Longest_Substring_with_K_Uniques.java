package Sliding_window;

import java.util.HashMap;

public class gfg_Longest_Substring_with_K_Uniques {
    static int SubString(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        int maxL=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if (map.size()==k){
                maxL=Math.max(maxL,i-j+1);
            }
            else {
                while (map.size()>k){
                    char chh=s.charAt(j);
                    map.put(chh,map.get(chh)-1);

                    if (map.get(chh)==0){
                        map.remove(chh);
                    }
                    j++;
                }

                if (map.size()==k){
                    maxL=Math.max(maxL,i-j+1);
                }
            }
        }
        return maxL;
    }
    static void main(String[] args) {

    }
}
