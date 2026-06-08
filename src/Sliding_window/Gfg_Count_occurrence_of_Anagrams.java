package Sliding_window;
//gfg=https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1


import java.util.HashMap;

public class Gfg_Count_occurrence_of_Anagrams {
    static int  Count(String pat,String txt){
        HashMap<Character,Integer> map=new HashMap<>();
//pattern map
        for (int i=0;i<pat.length();i++){
            char c=pat.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int k=pat.length();
        int count=map.size();
        int ans=0;

        //first window

        for(int j=0;j<k;j++){
            char ch=txt.charAt(j);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);

                if (map.get(ch)==0){
                    count--;
                }
            }
        }
        if (count==0){
                ans++;
        }

//        other window

        for (int i=k;i<txt.length();i++){
            char remove=txt.charAt(i-k);
            if (map.containsKey(remove)){
                if (map.get(remove)==0){
                    count++;
                }
                map.put(remove,map.get(remove)+1);
            }


            char add=txt.charAt(i);

            if (map.containsKey(add)){
                map.put(add,map.get(add)-1);

                if (map.get(add)==0){
                    count--;
                }
            }
            if (count==0){
                ans++;
            }

        }
        return ans;
    }

//    code it after 2 week and good is that i solve it without any support
//    lage raho dewansh sab easy hai kar lenge
    static  int Anagrams(String s, String pat){
        HashMap<Character,Integer> map=new HashMap<>();

        for (int m=0;m<pat.length();m++){
            map.put(pat.charAt(m),map.getOrDefault(pat.charAt(m),0)+1);
        }
        int k=map.size();
        int count=map.size();
        int ans=0;

        for (int i=0;i<k;i++){
            char ch=s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch)==0){
                    count--;
                }
            }
        }
        if (count==0){
            ans++;
        }

        for (int i=k;i<s.length();i++){
            char remove=s.charAt(i-k);

            if (map.containsKey(remove)){
                if (map.get(remove)==0){
                    count++;
                }
                map.put(remove,map.get(remove)+1);
            }

            char add=s.charAt(i);

            if (map.containsKey(add)){
                map.put(add, map.get(add) - 1);

                if (map.get(add)==0){
                    count--;
                }

            }

            if (count==0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
String s="forxxorfxdofr";
String p="for";
int result=Anagrams(s,p);
        System.out.println(result);
    }
}
