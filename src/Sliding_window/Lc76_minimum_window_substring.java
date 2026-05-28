package Sliding_window;

import java.util.HashMap;

public class Lc76_minimum_window_substring {
    static String MWS(String s,String t){
    HashMap<Character,Integer> map=new HashMap<>();

    for (int i=0;i<t.length();i++){
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
    }
    int count=map.size();
    int ans=0;
    int start=0;
    int minl=Integer.MAX_VALUE;

    for (int end=0;end<s.length();end++){
        char ch=s.charAt(end);
        if (map.containsKey(ch)){
            map.put(ch,map.get(ch)-1);

            if (map.get(ch)==0){
                count--;
            }

        }


//        shrink

        while (count==0){
           int l=end-start+1;
            if (l<minl){
               minl=l;
               ans=start;
            }
            char chh=s.charAt(start);
            if (map.containsKey(chh)){
                map.put(chh, map.getOrDefault(chh,0)+1);

                if (map.get(chh)>0){
                    count++;
                }
            }
                start++;

        }
    }
    return minl==Integer.MAX_VALUE?"": s.substring(ans,ans+minl);
    }
    static void main(String[] args) {

    }
}
