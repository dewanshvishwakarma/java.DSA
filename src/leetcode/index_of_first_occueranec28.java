package leetcode;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class index_of_first_occueranec28 {
   static public int strStr(String haystack, String needle) {
       int m=haystack.length();
       int n=needle.length();

       for (int i=0;i<=m-n;i++){
           for (int j=0;j<n;j++){
               if (haystack.charAt(i+j)!=needle.charAt(j)){
                   break;
               }
               if (j==n-1){
                   return i;
               }
           }
       }
       return -1;
    }
    public static void main(String[] args){
    String s="sadbutsad";
    String y="but";
    int result=strStr(s,y);
        System.out.println(result);
    }
}
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
