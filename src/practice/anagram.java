package practice;

public class anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] a=new int[26];
         int[] aa=new int[26];

        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            int index2=t.charAt(i)-'a';
            a[index]=a[index]+1;
            aa[index2]=aa[index2]+1;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!=aa[i]){
                return false;
            }
        }
        return true;
    }
    static void main(String[] args){

    }
}
