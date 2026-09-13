package leetcode;

public class longest_common_prefix14 {
    static String  longestCommonPrefix(String[] a){
        String ref=a[0];
        for (int i=0;i<ref.length();i++){
            char ch=ref.charAt(i);
            for (int j=1;j<a.length;j++){
                if (i>a[j].length()||ch!=a[j].charAt(i)){
                    return ref.substring(0,i);
                }
            }
        }
        return ref;
    }

    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       String ans=longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
