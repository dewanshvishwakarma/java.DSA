package Sliding_window;

import java.util.HashSet;
import java.util.Set;
//approach 1 with the help of Hashset
public class LC3_longest_substring_without_repeating_character {
    static int Str(String s){
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int maxL=0;
//        int i=0;
//        int j=0;
//        for (int j=0;j<n;j++){
//            while (set.contains(s.charAt(j))){
//                set.remove(s.charAt(i));
//                i++;
//            }
//            set.add(s.charAt(j));
//            maxL=Math.max(maxL,j-i+1);
//        }
//        return maxL;




        int windowStart=0;
        int windowEnd=0;
        while (windowEnd<n){
            char ch = s.charAt(windowEnd);

            if (set.contains(ch)){
                while (windowStart<windowEnd && set.contains(ch)){
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            }
            set.add(ch);
            maxL=Math.max(maxL,windowEnd-windowStart+1);
            windowEnd++;
        }
        return maxL;



    }


    public static void main(String[] args) {
String s1= "bbbbb";
int result=Str(s1);
        System.out.println(result);
    }
}
