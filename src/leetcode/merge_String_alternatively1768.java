package leetcode;

public class merge_String_alternatively1768 {
    static String mergeAlternately(String word1, String word2){
        int m=word1.length();
        int n=word2.length();
        StringBuilder result=new StringBuilder();

        int i=0;
        int j=0;
        while (i<m || j<n){
            if (i<m){
                result.append(word1.charAt(i));
                i++;
            }
            if (j<word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
      String  word1 = "abc", word2 = "pqr";
      String result=mergeAlternately(word1,word2);
        System.out.println(result);

    }
}
