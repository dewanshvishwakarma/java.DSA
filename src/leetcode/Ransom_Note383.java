package leetcode;

import java.util.HashMap;

public class Ransom_Note383 {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count=map.size();
        for (int i=0;i<magazine.length();i++){
            char ch2=magazine.charAt(i);
            if (map.containsKey(ch2) && map.get(ch2)>0){
                map.put(ch2,map.get(ch2)-1);
                if (map.get(ch2)==0) {
                count--;
            }
            }
        }

        return count==0;
    }


    //use an array
    static boolean canConstruct1(String r,String m){
        int[] a=new int[26];
        for (int i=0;i<r.length();i++){
            int index=r.charAt(i)-'a';
            a[index]=a[index]+1;
        }

        for (int i=0;i<m.length();i++){
            int index2=m.charAt(i)-'a';
            if (a[index2]>0) {
                a[index2] = a[index2] - 1;
            }
        }

        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
String r="dewa";
String m="awedg";
boolean ans =canConstruct(r,m);
        System.out.println(ans);
    }
}
